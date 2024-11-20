package linear_search;

public class SearchInString {
    public static void main(String[] args) {
        String s = "Vikram";
        char target = 'V';
        // for (int i = 0; i < s.length(); i++) {
        // if (target == s.charAt(i)) {
        // System.out.println(i);
        // }
        // }
        for (char ch : s.toCharArray()) {
            if (ch == target) {
                System.out.println(ch);
            }

        }
    }
}
