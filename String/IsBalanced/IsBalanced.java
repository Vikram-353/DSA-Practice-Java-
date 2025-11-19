package String.IsBalanced;

public class IsBalanced {
    public static void main(String[] args) {
        String num = "24123";
        System.out.println(isBalanced(num));
    }

    public static boolean isBalanced(String num) {

        char[] nums = num.toCharArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenSum += (nums[i] - 48);
            } else {
                oddSum += (nums[i] - 48);
            }
        }

        return evenSum == oddSum;
    }
}
