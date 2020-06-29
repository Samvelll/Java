package am.sam.algorithm;

public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
        BubbleSort obj = new BubbleSort();

        obj.sort(arr);
        obj.print(arr);
    }
}
