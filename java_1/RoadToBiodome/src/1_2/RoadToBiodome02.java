public class RoadToBiodome02 {
    static char[] stack = new char[1000000];
    static int top = 0;
    static int bottom = 0;

    public static void main(String[] args) {
        try {
            for (int i = 0; i < args.length; i++) {
                for (int j = 0; j < args[i].length(); j++) {
                    char temp = args[i].charAt(j);
                    push(temp);
                }
                push(' ');
            }
            pop();
            if (isPalindrome()) {
                System.out.println("Bonus Palindrome!");
                for (int i = 0; i < top; i++) {
                    System.out.print(stack[i]);
                }
                return;
            }
            while (!isEmpty()) {
                System.out.print(pop());
            }
        } catch (Exception e) {
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한번 확인해주세요.");
        }
    }

    public static boolean isPalindrome() {
        for (int i = 0; i < top / 2; i++) {
            if (stack[i] != stack[top - i - 1])
                return false;
        }
        return true;
    }
    public static void push(char alpa) {
        stack[top] = alpa;
        top++;
    }

    public static char pop() {
        return stack[--top];
    }

    public static char peek() {
        return stack[top];
    }

    public static boolean isEmpty() {
        if(top == bottom)
            return true;
        else
            return false;
    }
}
