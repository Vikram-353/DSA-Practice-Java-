package BitMnupilation;

public class singleCount2 {
    public static void main(String[] args) {
        int[] num = { -2, -2, 1, 1, 4, 1, 4, 4, -4, -2 };
        System.out.println(singleNumber(num));

    }

    public static int singleNumber(int[] nums) {
        // int result = 0;
        // for (int bitIndex = -30; bitIndex < 31; bitIndex++) {
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if ((nums[i] & (1 << bitIndex)) != 0) {
        // count++;
        // }
        // }
        // if (count % 3 == 1) {
        // result = result | (1 << bitIndex);
        // }
        // }
        // return result;
        int n = nums.length;
        int ones = 0, twos = 0;
        for (int i = 0; i < n; i++) {
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;
    }
}
