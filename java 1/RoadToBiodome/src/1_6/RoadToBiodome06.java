public class RoadToBiodome06 {
    public static void main(String[] args) {
        try {
            int[] water_level = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                if (args[i].contains("["))
                    water_level[i] = Integer.parseInt(args[i].substring(1, args[i].length() - 1));
                else
                    water_level[i] = Integer.parseInt(args[i].substring(0, args[i].length() - 1));
                if (water_level[i] < 0 || water_level[i] > 100) {
                    System.out.println("입력된 값이 올바르지 않습니다.");
                    return;
                }
            }
            quickSort(water_level);

            if (water_level.length % 2 == 0) {
                System.out.printf("Mean : %.1f, Median : %.1f", average(water_level),
                        (water_level[water_level.length / 2 - 1] + water_level[water_level.length / 2]) / 2.0);
            } else {
                System.out.printf("Mean : %.1f, Median : %.1f", average(water_level),
                        (double) water_level[water_level.length / 2]);
            }

            System.out.println("Bonus");
            int cnt = 0;
            while(water_level[cnt] < 30)
                cnt++;
            if ((water_level.length - cnt) % 2 == 0) {
                System.out.printf("Mean : %.1f, Median : %.1f", average(water_level),
                        (water_level[(water_level.length - cnt) / 2 - 1] + water_level[(water_level.length - cnt) / 2]) / 2.0);
            } else {
                System.out.printf("Mean : %.1f, Median : %.1f", average(water_level),
                        (double) water_level[(water_level.length - cnt) / 2]);
            }

        } catch (Exception e) {
            System.out.println("입력된 값이 올바르지 않습니다.");
        }
    }
    
    public static double average_up_30(int[] values) {
        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 30) {
                sum += values[i];
                cnt++;
            }
        }
        return sum / cnt;
    }

    public static double average(int[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        int ls = partition(arr, start, end);
        if (start < ls - 1)
            quickSort(arr, start, ls - 1);
        if (ls < end)
            quickSort(arr, ls, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot)
                start++;
            while (pivot < arr[end])
                end--;
            if (start <= end)
                swap(arr, start++, end--);
        }
        return start;
    }

    public static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }
}
