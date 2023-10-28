public class HelloBiodome01 {
    public static void main(String[] args) {

        try {
            String name = new String(args[0]);
            name = "";
            name = name_sum(args, name, 0);
            System.out.printf("안녕하세요 %s님! :)",name);
            System.out.println("Bonus");
            System.out.printf("안녕하세요 \"%c%c%c%c%c%c%c%c%c%c\"님!", name.charAt(0),name.charAt(1),name.charAt(2),name.charAt(3),name.charAt(4),name.charAt(5),name.charAt(6),name.charAt(7),name.charAt(8),name.charAt(9));
        } catch (Exception e) {
            System.out.print("다시 입력해 주세요");
        }
    }

    public static String name_sum(String[] names, String name, int i) {
        try {
            name += names[i];
            name += " ";
            return name_sum(names, name, i + 1);
        } catch (Exception e) {
            return name;
        }
    }
}