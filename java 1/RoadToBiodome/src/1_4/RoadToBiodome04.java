public class RoadToBiodome04 {
    public static void main(String[] args) {
        try {
            int[] EUsing = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                if (i == 0)
                    EUsing[i] = Integer.parseInt(args[i].substring(1, args[i].length() - 1));
                else
                    EUsing[i] = Integer.parseInt(args[i].substring(0, args[i].length() - 1));
            }
            selection_sort(EUsing);
            System.out.printf("평균값 : %.2f, 중앙값 : %.2f", average(EUsing), find_middle_value(EUsing));
        } catch (Exception e) {
            System.out.println("입력된 값이 올바르지 않습니다.");
        }
    }

    public static void selection_sort(int[] values) {
        int temp,temp_num;
        int j;
        for (int i = 0; i < values.length; i++) {
            temp = values[i];
            temp_num = i;
            for (j = i; j < values.length; j++) {
                if (values[j] < temp) {
                    temp = values[j];
                    temp_num = j;
                }
            }
            values[temp_num] = values[i];
            values[i] = temp;
        }
    }

    public static double find_middle_value(int[] values) {
        if (values.length % 2 == 1) {
            return values[(values.length-1) / 2];
        }
        else {
            return (values[(values.length - 1) / 2] + values[(values.length - 1) / 2 + 1]) / 2.0;        }
    }

    public static double average(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return (double) sum / values.length;
    }
}