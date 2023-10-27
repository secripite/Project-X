public class RoadToBiodome01 {
    public static void main(String[] args) {
        try {
            int[] waves = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                if(i == 0 || i == args.length)
                    waves[i] = Integer.parseInt(args[i].substring(1,args[i].length()-1));
                else
                    waves[i] = Integer.parseInt(args[i].substring(0,args[i].length()-1));
                if (waves[i] < 0 || waves[i] > 1000) {
                    System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    return;
                }
            }
            System.out.printf("%d", Exist_cnt(waves));
        } catch (Exception e) {
            System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
        }
    }

    public static int Exist_cnt(int[] waves) {
        int[] memo = new int[1000];
        for (int i = 0; i < waves.length - 1; i++) {
            memo[waves[i]] += 1;
        }
        for (int i = 0; i < 1000; i++) {
            if (memo[i] == 1)
                return i;
        }
        return 0;
    }
}
