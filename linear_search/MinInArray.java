package linear_search;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -9, 7 };
        int min = arr[0];
        // for (int i = 0; i < arr.length; i++) {

        // if (min > arr[i]) {
        // min = arr[i];
        // }
        // }

        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }

        System.out.println(min);
    }

}
