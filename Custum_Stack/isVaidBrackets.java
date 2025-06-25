package Custum_Stack;

import java.util.Stack;

public class isVaidBrackets {
    public static void main(String[] args) {
        String a = "(){}[]";
        System.out.println(isValid(a));
    }

    public static Boolean isValid(String a) {
        String open = "({[";
        String close = ")}]";

        Stack<Character> stack = new Stack<>();

        int i = 0;
        while (i < a.length()) {
            char ch = a.charAt(i);

            if (open.contains(String.valueOf(ch))) {
                stack.push(ch);
            } else if (close.contains(String.valueOf(ch))) {
                if (stack.isEmpty())
                    return false;
                char popped = stack.pop();
                if (!nullifies(popped, ch)) {
                    return false;
                }
            }

            i++;
        }

        return stack.isEmpty();
    }

    private static Boolean nullifies(char a, char b) {
        return (a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']');
    }
}
