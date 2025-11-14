package String.RemoveLastParanthesis;

public class RemoveLastParanthesis {
    public static void main(String[] args) {
        String s = "()()";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        char[] list = s.toCharArray();
        int count = 0;
        for (char c : list) {
            if (c == '(') {
                if (count > 0) {
                    result.append("(");
                    count++;
                } else {
                    count++;
                }

            }
            if (c == ')') {
                if (count > 1) {
                    result.append(')');

                    count--;
                } else {
                    count--;
                }
            }
        }
        return result.toString();
    }
}
