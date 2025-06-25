package Custum_Stack;

import java.util.Stack;

public class countValidParanthesis {
    public static void main(String[] args) {
        String s = ")(";
        int result = minAddToMakeValid(s);
        System.out.println(result);
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    count++;
                }

            }
            i++;
        }

        return stack.size() + count;
    }

}
