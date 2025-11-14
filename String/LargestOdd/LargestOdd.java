package String.LargestOdd;

public class LargestOdd {
    public static void main(String[] args) {
        String s = "5101";
        System.out.println(largestOddNumber(s));
    }

    public static String largestOddNumber(String num) {
        StringBuilder result = new StringBuilder();
        char[] list = num.toCharArray();
        for (char c : list) {
            result.append(c);
        }

        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) % 2 != 0) {
                break;
            } else {
                result.deleteCharAt(i);
            }
        }
        return result.toString();
    }
}
