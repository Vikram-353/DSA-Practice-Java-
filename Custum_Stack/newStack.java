package Custum_Stack;

public class newStack {
    public static void main(String[] args) throws Exception {
        CustumSTack li = new DynamicCustomStack(4);
        li.push(9);
        li.push(7);
        li.push(7);
        li.push(7);
        li.push(7);
        li.push(8);

        System.out.println(li.pop());
        System.out.println(li.pop());
        System.out.println(li.pop());
        System.out.println(li.peak());

    }
}
