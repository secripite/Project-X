public class HelloBiodome03 {
    public static void main(String[] args) {
        try
        {
            double temp = Double.parseDouble(args[0]);
            double humi = Double.parseDouble(args[1]);
            double oxi = Double.parseDouble(args[2]);
            double rut_Humi = cal_sqrt(cal_near_val(humi,1.0),0,humi);
            double absol = absolute_humi_Temp(rut_Humi,temp);

            double H = cal_H_val(absol,oxi);

            System.out.printf("생명지수 H = %.2f",H);

        }catch (Exception e)
        {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
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
