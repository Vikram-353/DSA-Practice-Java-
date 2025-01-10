package questions.Arrays.MaxConsecutiveOne;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] a = { 1, 1, 0, 0, 1, 1, 1 };
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;

            } else if (a[i] == 0) {
                count = 0;
            }
            if (count >= max_count) {
                max_count = count;
            }
        }
        System.out.println(max_count);
    }
}
