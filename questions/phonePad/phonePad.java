package questions.phonePad;

import java.util.ArrayList;
import java.util.List;

public class phonePad {
    public static void main(String[] args) {
        pad("", "23");
        System.out.println(padRet("", "12"));
    }

    static void pad(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit) * 3; i++) {
            char ch = (char) ('b' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }

        return list;
    }

    // static String[] KEYPAD = {
    // "",
    // "",
    // "abc",
    // "def",
    // "ghi",
    // "jkl",
    // "mno",
    // "pqrs",
    // "tuv",
    // "wxyz"
    // };

    // static List<String> padRet(String p, String up) {
    // if (up.isEmpty()) {
    // List<String> list = new ArrayList<>();
    // list.add(p);
    // return list;
    // }

    // List<String> list = new ArrayList<>();
    // int digit = up.charAt(0) - '0';
    // String chars = KEYPAD[digit];

    // for (char ch : chars.toCharArray()) {
    // list.addAll(padRet(p + ch, up.substring(1)));
    // }

    // return list;
    // }
}
