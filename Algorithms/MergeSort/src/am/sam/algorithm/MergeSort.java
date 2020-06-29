package am.sam.algorithm;

public class MergeSort {
    public void sort(int[] arr, int l, int r) {
        if(l < r) {
            int m = l + (r - l)/2;

            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, r);
        }
    }

    public void merge(int[] arr, int l, int r) {
        int m = l + (r - l)/2;
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for(int j = 0; j < n2; j++) {
            R[j] = arr[m + j + 1];
        }
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2) {
            if(L[i] < R[j]) {
                arr[l + k] = L[i];
                i++;
            }
            else {
                arr[l + k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[l + k] = L[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[l + k] = R[j];
            j++;
            k++;
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
        MergeSort obj = new MergeSort();
        int n = arr.length;

        obj.sort(arr, 0 , n - 1);
        obj.print(arr);
    }
}
