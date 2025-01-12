package questions.Arrays.MaxProductSubarray;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 0, -4, -5 };
        int maxProduct = Integer.MIN_VALUE;
        int product = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                product = a[i] * a[j];
                if (maxProduct <= product) {
                    maxProduct = product;
                }
            }
        }
        System.out.println(maxProduct);
    }
}
