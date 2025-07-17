package String.ReverseWords;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "   My      name is Vikram Ranjan";
        String[] result = str.trim().split("\\s+");
        System.out.println(Arrays.toString(result));

        // int left = 0;
        // int right = result.length - 1;
        // while (left < right) {
        // String temp = result[left];
        // result[left] = result[right];
        // result[right] = temp;
        // left++;
        // right--;
        // }

        // System.out.println(Arrays.toString(result));

        StringBuilder sb = new StringBuilder();

        for (int i = result.length - 1; i >= 0; i--) {
            sb.append(result[i]);
            if (i != 0) {
                sb.append(" ");
            }

        }

        String ans = sb.toString().trim();

        System.out.println(ans);

    }
}
