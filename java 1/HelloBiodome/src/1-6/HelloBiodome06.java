public class HelloBiodome06 {
    public static void main(String[] args){
        try{
            String[] dna1 = args[0].split("");
            String[] dna2 = args[1].split("");
        }
        catch (Exception e) {
            System.out.println("두 개의 유전자 코드를 입력해주세요.");
        }
        what_long(args[0].length(),args[1].length());
    }
    public static int what_long(int dna1,int dna2){
        if(dna1>dna2){
            return 1;
        }
        else if (dna1<dna2) {
            return 2;
        }
        else {
            return 3;
        }
    }
}
