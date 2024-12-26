package questions.SecondLargest;

public class SecondLargestandSmallest {
    public static void main(String[] args) {

        // ----------------------OPtimal Approach----------------------
        int[] arr = { 2, 2, 2 };
        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondLargest = large;
                large = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest exist:");
        } else {
            System.out.println(large);
            System.out.println(secondLargest);
        }

        // -----------------------My Approach-------------------------
        // int[] arr = { 2, 4, 2, 0, 6, 4, -1, 0, 0, 9 };
        // int large = Largest(arr);

        // int[] arr2 = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != large) {
        // arr2[i] = arr[i];
        // }
        // }

        // int secondLargest = Largest(arr2);

        // System.out.println(secondLargest);

    }

    // ___________________My Approach__________________________

    // public static int Largest(int[] arr) {
    // int largest = Integer.MIN_VALUE;
    // for (int i : arr) {
    // if (i >= largest) {
    // largest = i;
    // }
    // }
    // return largest;
    // }
}
