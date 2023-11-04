public class RoadToBiodome08 {
    public static int[] queue = null;
    private static int rear = 0;
    private static int front = 0;
    public static void main(String[] args) {
        int flag = 0;
        int size = 0;
        size = ((args.length / 10) + 1) * 10;
        if (args.length > 10) {
            queue = new int[size];
            flag = 1;
        } else {
            queue = new int[10];
        }
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            enqueue(value);
        }
        while (front < rear) {
            System.out.println("자원 " + dequeue() + "을 제공했습니다.");
        }
        System.out.println("모든 요청이 처리되었습니다.");


        if (flag == 1){
            System.out.println("Bonus");
            System.out.println("Queue의 크기가 "+ size +"으로 늘어났습니다.");
        }
        else {
            System.out.println("Bonus");
            System.out.println("Queue의 크기가 "+ size +"입니다.");
        }
        front = 0;
        rear = 0;
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            enqueue(value);
        }
        while (front < rear) {
            System.out.println("자원제공: " + dequeue());
        }
    }

    public static void enqueue(int value) {
        queue[rear++] = value;
    }

    public static int dequeue() {
        return queue[front++];
    }

    public static boolean isEmpty() {
        if(front == rear)
            return true;
        else
            return false;
    }

    public static int peek() {
        return queue[front];
    }
}
