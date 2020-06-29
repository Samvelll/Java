package am.sam.algorithm;

public class QuickSort {
    public void sort(int[] arr, int l, int r) {
        if(l < r) {
            int pi = partition(arr, l, r);

            sort(arr, l, pi - 1);
            sort(arr, pi + 1, r);
        }
    }

    public int partition(int[] arr, int l, int r) {
        int i = l - 1;

        for(int j = l; j < r; j++) {
            if(arr[j] < arr[r]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;

    }
    public void print(int[] arr) {
        int n = arr.length;

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 3, 12, 4, 6};
        QuickSort obj = new QuickSort();

        obj.sort(arr, 0, arr.length - 1);
        obj.print(arr);
    }
}
