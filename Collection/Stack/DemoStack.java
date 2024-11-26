package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);

        }
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

        // Stack Implementation through LinkedList
        LinkedList<Integer> stack1 = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            stack1.addLast(i);
        }
        System.out.println(stack1);

        System.out.println(stack1.getLast());
        stack1.removeLast();
        System.out.println(stack1);
    }
}
