package questions.Arrays.RotateLeftByOne;

public class RotateLeftByOne {
    public static void main(String[] args) {

        // my approach is Optimal approach
        int[] arr = { 1, 2, 3, 4, 5 };
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
