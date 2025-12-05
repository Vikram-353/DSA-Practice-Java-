package questions.Arrays.CountPartitions;

public class CountPartitions {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        System.out.println(countPartitions(arr));
    }

    public static int countPartitions(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            int partition1 = countOdd(nums, 0, i);
            int partition2 = countOdd(nums, i + 1, n - 1);
            if ((partition1 == 1 && partition2 == 1) || (partition1 == 0 && partition2 == 0)) {
                result++;
            }
        }

        return result;
    }

    static int countOdd(int[] nums, int i, int j) {
        int countOdd = 0;
        for (int k = i; k <= j; k++) {
            if (nums[k] % 2 != 0) {
                countOdd++;
            }
        }

        if (countOdd % 2 == 0) {
            return 0;
        }
        return 1;
    }
}
