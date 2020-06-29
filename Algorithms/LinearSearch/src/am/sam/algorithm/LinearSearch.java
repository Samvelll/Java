package am.sam.algorithm;

public class LinearSearch {
    public boolean search(int[] arr, int x) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                System.out.println("The element is present in array at " + i);
                return true;
            }
        }
        System.out.println("The element is not present in array");
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {11, 4, 5, 9, 3, 22};
        int x = 4;
        LinearSearch obj = new LinearSearch();

        obj.search(arr, x);

    }
}
