package String.Palindrom;

public class Palindrom {
    public static void main(String[] args) {
        String word = "abcdcba";
        if (SayPalindrom(word)) {
            System.out.println(word);
        }

    }

    static boolean SayPalindrom(String word) {
        if (word == null || word.length() == 0) {
            return true;
        }
        for (int i = 0; i < word.length(); i++) {
            char start = word.charAt(i);
            char end = word.charAt(word.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
