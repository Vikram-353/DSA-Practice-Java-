package questions.Arrays.KLengthApart;

public class KLengthApart {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 1, 0, 1 };
        int k = 2;
        System.out.println(kLengthApart(nums, k));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] == 1) {
                if (right - left <= k && left != right && nums[left] == 1) {
                    return false;
                }
                left = right;
            }
            right++;
        }

        return true;
    }
}
