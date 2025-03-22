package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'a', 'b', 'c' };
        reString(0, s);

    }

    static void reString(int start, char[] s) {
        if (start >= s.length) {
            return;
        }

        reString(start + 1, s);
        System.out.print(s[start] + " ");
    }
}
