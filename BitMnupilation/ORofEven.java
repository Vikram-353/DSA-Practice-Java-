package BitMnupilation;

public class ORofEven {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println(evenNumberBitwiseORs(nums));

    }

    public static int evenNumberBitwiseORs(int[] nums) {
        int or = 0;
        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] & 1) == 0) {
                or = or | nums[i];
            }
        }
        return or;
    }
}
