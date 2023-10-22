public class HelloBiodome02 {
    public static void main(String[] args) {
        try {
            int energy1 = Integer.parseInt(args[0]);
            int energy2 = Integer.parseInt(args[1]);
            int energy3 = Integer.parseInt(args[2]);

            double sum = energy1+energy2+energy3;

            if(energy1<0){
                System.out.println("음수입니다.");
                return;
            }
            if(energy2<0){
                System.out.println("음수입니다.");
                return;
            }
            if(energy3<0){
                System.out.println("음수입니다.");
                return;
            }

            System.out.println("총 에너지 사용량은 " + (int)sum +"입니다.");
            System.out.printf("태양광 %.7f%%, 풍력 %.7f%%, 지열 %.7f%%",(energy1/sum*100),(energy2/sum*100),(energy3/sum*100));
        } catch (Exception e)
        {
            System.out.println("에러!");
        }
    }
}