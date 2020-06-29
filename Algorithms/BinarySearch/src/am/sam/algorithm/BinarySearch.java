package am.sam.algorithm;

public class BinarySearch {
    public boolean search(int[] arr, int l, int r, int x) {
        int m = l + (r - l)/2;

        if(l < r) {
            if(arr[m] == x) {
                System.out.println("The element is present in array at " + m);
                return true;
            }

            if(x < arr[m]) {
                return search(arr, l, m - 1, x);
            }

            if(x > arr[m]) {
                return search(arr, m + 1, r, x);
            }
        }
        System.out.println("The element is not present in array");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int x = 5;
        BinarySearch obj = new BinarySearch();

        obj.search(arr, 0, n - 1, x);

    }
}
