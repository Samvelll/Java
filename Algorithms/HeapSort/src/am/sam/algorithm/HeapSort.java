package am.sam.algorithm;

public class HeapSort {
    public void heapify(int[] arr, int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left <  n && arr[left] > arr[largest]) {
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, largest, n);
        }
    }

    public void sort(int[] arr) {
        int n = arr.length;

        for(int i = n/2 + 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for(int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
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
        HeapSort obj = new HeapSort();

        obj.sort(arr);
        obj.print(arr);
    }
}
