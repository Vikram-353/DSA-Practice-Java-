package questions.RotateRightByK;

public class RotateRightByK {
    public static void main(String[] args) {
        int k = 3;

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int point = k % arr.length;
        // My Approach

        // for (int i = 0; i < point; i++) {
        // for (int j = arr.length - 1; j > 0; j--) {
        // int temp = arr[j - 1];
        // arr[j - 1] = arr[j];
        // arr[j] = temp;
        // }
        // }

        // Space optimized approach
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[(i + point) % arr.length] = arr[i];
        }

        // Printing the rotated array
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }

    }

}
