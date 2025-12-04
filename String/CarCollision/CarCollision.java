package String.CarCollision;

import java.util.Stack;

public class CarCollision {
    public static void main(String[] args) {
        String directions = "SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR";
        System.out.println(countCollisions(directions));
    }

    public static int countCollisions(String directions) {
        int result = 0;

        int n = directions.length();
        int i = 0, j = n - 1;

        while (i < n && directions.charAt(i) == 'L') {
            i++;
        }

        while (j >= 0 && directions.charAt(j) == 'R') {
            j--;
        }

        for (int j2 = i; j2 <= j; j2++) {
            if (directions.charAt(j2) != 'S') {
                result++;
            }
        }

        return result;

        // Stack<Character> stack = new Stack<>();
        // for (int i = directions.length() - 1; i >= 0; i--) {
        // stack.add(directions.charAt(i));
        // }
        // char curr = stack.pop();
        // while (!stack.isEmpty()) {
        // char next = stack.pop();

        // if ((curr == 'R' && next == 'L')) {
        // result += 2;
        // curr = 'S';
        // } else if ((curr == 'S' && next == 'L') || (curr == 'R' && next == 'S')) {
        // result += 1;
        // curr = 'S';
        // } else {
        // curr = next;
        // }

        // }
    }
}
