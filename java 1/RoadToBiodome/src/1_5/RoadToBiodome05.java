public class RoadToBiodome05 {
    public static void main(String[] args) {

    }
    private static void quickSort(int[] arr) { // �� ���� �Լ�
        quickSort(arr, 0, arr.length-1); // ��� �Լ� ȣ��
     }
     
     private static void quickSort(int[] arr, int start, int end) {
        int ls = partition(arr, start, end); // ���ҵ� ������ ��Ʈ�� ���� ��
  
        if(start < ls-1) quickSort(arr, start, ls-1); // ���ʿ� ������ ���� ���Ҵٸ� ��� ȣ��
        if(ls < end) quickSort(arr, ls, end); // �����ʿ� ������ ���� ���Ҵٸ� ��� ȣ��
        
     }
     
     private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2]; // �迭�� �߰� ���� pivot���� ��
        
        while(start <= end) {
           while(arr[start] < pivot) start++; // pivot ���� ū���� ���� ������ Ž��
           while(pivot < arr[end]) end--; // pivot ���� ���� ���� ���� ������ Ž��
           
           if(start <= end) swap(arr, start++, end--); // �� ���� ��ȯ
        }
        return start; // ���� ���� ������ ��Ƽ���� ���۰� ��ȯ
     }
     
     private static void swap(int[] arr, int start, int end) { // ��� ��ȯ �Լ�
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
     }
}
