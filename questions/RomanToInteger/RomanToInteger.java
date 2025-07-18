package questions.RomanToInteger;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        // Stack<Integer> st = new Stack<>();
        int result = 0;
        if (s.isEmpty()) {
            return -1;
        }

        char[] str = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] arr = { 1, 5, 10, 50, 100, 500, 1000 };

        Map<Character, Integer> table = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            table.put(str[i], arr[i]);
        }
        // int i = 0;
        // while (i < s.length()) {
        // if (st.empty() || st.peek() >= table.get(s.charAt(i))) {
        // st.push(table.get(s.charAt(i)));
        // } else {
        // st.push(table.get(s.charAt(i)) - st.pop());
        // }
        // i++;
        // }

        // while (st.size() != 0) {
        // System.out.println(st.peek());
        // result = result + st.pop();

        // }

        for (int i = 0; i < s.length(); i++) {
            int value = table.get(s.charAt(i));
            if (i + 1 < s.length() && table.get(s.charAt(i + 1)) > value) {
                result -= value;
            } else {
                result += value;
            }
        }

        return result;
    }
}
