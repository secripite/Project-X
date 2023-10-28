public class RoadToBiodome04 {
    public static void main(String[] args) {
        try {
            int temp_index = args.length;
            for (int j = 0; j < args.length; j++) {
                if (args[j].substring(1).equals("],")) {
                    temp_index = j+1;
                    break;
                }
            }
                int[] EUsing1 = new int[temp_index];
                int[] EUsing2 = new int[args.length - temp_index];
                int i,temp = 0;
                for (i = 0; i < args.length; i++) {
                    if (args[i].substring(1).equals("],")) {
                        EUsing1[i] = Integer.parseInt(args[i].substring(0, args[i].length() - 2));
                        i++;
                        temp = i;
                        break;
                    }
                    if (i == 0)
                        EUsing1[i] = Integer.parseInt(args[i].substring(1, args[i].length() - 1));
                    else
                        EUsing1[i] = Integer.parseInt(args[i].substring(0, args[i].length() - 1));
                }
                for (; i < args.length; i++) {
                    if(i == temp)
                        EUsing2[i-temp] = Integer.parseInt(args[i].substring(1, args[i].length() - 1));
                    else
                        EUsing2[i-temp] = Integer.parseInt(args[i].substring(0, args[i].length() - 1));
                }
                selection_sort(EUsing1);
                selection_sort(EUsing2);
                System.out.printf("%f, %f", find_middle_value(EUsing1), find_middle_value(EUsing2));
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