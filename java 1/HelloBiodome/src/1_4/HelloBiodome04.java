public class HelloBiodome04 {
    public static void main(String[] args) {
        try
        {
            double temp = Double.parseDouble(args[0]);
            double humi = Double.parseDouble(args[1]);
            double oxi = Double.parseDouble(args[2]);
            
            if(!check_temp(temp)){
                System.out.println("온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
                return;
            } else if (!check_humi(humi)) {
                System.out.println("습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
                return;
            } else if (!check_oxi(oxi)) {
                System.out.println("산소값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
                return;
            }

            System.out.print("생명의 나무는 안정적인 상태입니다. ");
            double rut_Humi = cal_sqrt(cal_near_val(humi,1.0),0,humi);
            double absol = absolute_humi_Temp(rut_Humi,temp);

            double H = cal_H_val(absol,oxi);

            System.out.printf("건강지수는 %.2f입니다.",H);
        }
        catch (Exception e){
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
        }
    }
    public static boolean check_temp(double temp){
        if(temp<=10 || temp>27.5){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean check_humi(double humi){
         if (humi<=40 || humi >=60) {
            return false;
        }
         else {
             return true;
         }
    }
    public static boolean check_oxi(double oxi){
        if (oxi < 19.5 || oxi >23.5) {
            return false;
        }
        else {
            return true;
        }
    }
    public static double cal_near_val(double target, double multi){
        if(multi * multi == target){
            return multi;
        }
        else if(multi*multi>target){
            return multi-1;
        }
        return cal_near_val(target,multi+1);
    }
    public static double cal_sqrt(double multi,int count,double target){
        count++;
        if(count == 4){
            return multi;
        }
        multi = (multi +(target/multi))/2;

        return cal_sqrt(multi,count,target);
    }
    public static double absolute_humi_Temp(double humiditiy,double temperature){
        if(humiditiy < temperature){
            return temperature - humiditiy;
        }
        else{
            return humiditiy - temperature;
        }
    }
    public static double cal_H_val(double absol,double oxi){
        return 0.415 * absol + oxi/((3.141592)*(3.141592));
    }
}

