public class HelloBiodome09 {
    public static void main(String[] args) {
        try {
            int height = Integer.parseInt(args[0]);
            char pillar = args[1].charAt(0);
            if (height < 3 || height > 100) {
                System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
                return;
            }
            printTree(height, pillar);
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
        }
    }

    public static void printTree(int height, char pillar) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print(pillar);
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0; i < height ;i++){
            System.out.print(" ");
        }
        System.out.println("|");
    }
}

