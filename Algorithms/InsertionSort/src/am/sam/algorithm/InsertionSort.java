package am.sam.algorithm;

public class InsertionSort {
    public void sort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
    public void print(int[] arr) {
        int n = arr.length;

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 3, 12, 4, 6};
        InsertionSort obj = new InsertionSort();

        obj.sort(arr);
        obj.print(arr);
    }
}
