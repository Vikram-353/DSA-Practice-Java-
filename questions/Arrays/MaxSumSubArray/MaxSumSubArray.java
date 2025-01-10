package questions.Arrays.MaxSumSubArray;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] a = { -2 };
        int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i < a.length; i++) {
        // int sum = 0;
        // for (int j = i; j < a.length; j++) {
        // sum += a[j];
        // if (sum >= maxSum) {
        // maxSum = sum;

        // }

        // }

        // }
        // System.out.println(maxSum);

        // ------------Better approach--------------
        // int l = 0;
        // int r = 0;
        // int sum = 0;
        // for (int i = 0; i < a.length; i++) {
        // // int r = i;
        // if (r < a.length) {

        // sum += a[r];
        // r++;
        // if (sum >= maxSum) {
        // maxSum = sum;

        // }
        // }
        // }
        // System.out.println(maxSum);
        int currentSum = 0;

        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (a.length > 0 && currentSum < 0) {
                currentSum = 0;
            }

        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
