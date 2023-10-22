public class HelloBiodome01 {
    public static void main(String[] args) {

        try{
            String name = new String(args[0]);
            System.out.println("안녕하세요"+"\""+name+"\""+"님!");
        }
        catch (Exception e){
            System.out.print("다시 입력해 주세요");
        }
   }
}