package Recursion;

public class Palindrome {
    // Non recursive method
    // public static void main(String[] args) {
    // String name = "Vikram";
    // int left = 0;
    // int right = name.length() - 1;

    // while (left < right) {
    // char l = name.charAt(left);
    // char r = name.charAt(right);

    // if (!Character.isLetterOrDigit(l)) {
    // left++;
    // } else if (!Character.isLetterOrDigit(r)) {
    // right--;
    // } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
    // System.out.println(false);
    // return;
    // } else {
    // left++;
    // right--;
    // }
    // }

    // System.out.println(true);
    // }

    // Recursive method

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s, 0, s.length() - 1);
        System.out.println(result);
    }

    static boolean isPalindrome(String s, int left, int right) {
        if (left >= right / 2) {
            return true;
        }
        char r = s.charAt(right);
        char l = s.charAt(left);

        if (!Character.isLetterOrDigit(l)) {
            return isPalindrome(s, left + 1, right);

        }
        if (!Character.isLetterOrDigit(r)) {
            return isPalindrome(s, left, right - 1);

        }

        if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);

    }
}
