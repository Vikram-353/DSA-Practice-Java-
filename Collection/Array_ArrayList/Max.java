package Array_ArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 3, 4, 8, 4, 3, 10 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
