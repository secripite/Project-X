public class HelloBiodome06 {
    public static void main(String[] args){
        try{
            int who = what_long(args[0].length(), args[1].length());
            int i = 0;
            int flag = 10;

            while (i < args[0].length()) {
                if (args[0].charAt(i) != args[1].charAt(i)) {
                    flag = 1;
                    break;
                }
                i++;
            }

            if (flag == 10 && who == 2) {
                System.out.println("동일한 유전자 코드입니다.");
            }
            else if (flag == 1 && who == 2) {
                System.out.println("일치하지 않습니다.");
            }
            else if(who != 2){
                System.out.println("일치하지 않습니다.");
            }
            System.out.println("Bonus");
            if (flag == 10) {
                System.out.println("부분적으로 포함됩니다.");
            }
            else if (flag == 1) {
                System.out.println("포함되지 않습니다.");
            }
        }
        catch (Exception e) {
            System.out.println("두 개의 유전자 코드를 입력해주세요.");
        }


    }

    public static int what_long(int dna1, int dna2) {
        if (dna1<dna2) {
            return 1;
        }
        else {
            return 2;
        }
    }
}
