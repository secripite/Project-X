public class RoadToBiodome05 {
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

         System.out.print("[");

         for (int i = 0; i < water_level.length - 1; i++)
            System.out.print(water_level[i] + ", ");

         System.out.print(water_level[water_level.length - 1] + "]");

      } catch (Exception e) {
         System.out.println("입력된 값이 올바르지 않습니다.");
      }
   }
   
   public static void quickSort(int[] arr) { // 퀵 정렬 함수
      quickSort(arr, 0, arr.length - 1); // 재귀 함수 호출
   }
   
   public static void quickSort(int[] arr, int start, int end) {
      int ls = partition(arr, start, end); // 분할된 오른쪽 파트의 시작 값
      if (start < ls - 1)
         quickSort(arr, start, ls - 1); // 왼쪽에 정렬할 것이 남았다면 재귀 호출
      if (ls < end)
         quickSort(arr, ls, end); // 오른쪽에 정렬할 것이 남았다면 재귀 호출
   }
   
   
   public static int partition(int[] arr, int start, int end) {
      int pivot = arr[(start + end) / 2]; // 배열의 중간 수를 pivot으로 둠
      while (start <= end) {
         while (arr[start] < pivot)
            start++; // pivot 보다 큰수가 나올 때까지 탐색
         while (pivot < arr[end])
            end--; // pivot 보다 작은 수가 나올 때까지 탐색
         if (start <= end)
            swap(arr, start++, end--); // 두 수를 교환
      }
      return start; // 새로 나눌 오른쪽 파티션의 시작값 반환
   }
   
   public static void swap(int[] arr, int start, int end) { // 요소 교환 함수
      int tmp = arr[start];
      arr[start] = arr[end];
      arr[end] = tmp;
   }

}
