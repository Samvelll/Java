package am.sam.algorithm;

public class SelectionSort {
    public void sort(int[] arr) {
        int n = arr.length;

        for(int i = n - 1; i > 0; i--) {
            int max_index = i;
            for(int j = 0; j <= i; j++) {
                if(arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            int temp = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = temp;
        }
    }

    public void print(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");;
        }
    }
    public static void main(String[] args) {
        int arr[] = {11, 7, 9, 3, 12, 4, 6};
        SelectionSort obj = new SelectionSort();

        obj.sort(arr);
        obj.print(arr);
    }
}
