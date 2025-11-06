package questions.Math.LastRemaining;

import java.util.ArrayList;

public class LastRemaining {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(lastRemaining(n));
    }

    public static int lastRemaining(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);
        helper(list, true);
        return list.get(0);
    }

    public static ArrayList<Integer> helper(ArrayList<Integer> list, boolean flag) {
        if (list.size() == 1) {
            return list;
        }

        if (flag) {
            int left = 0;
            while (left < list.size()) {
                list.remove(left);
                left = left + 1;
                System.out.println(list);

            }
            return helper(list, !flag);
        } else {
            int right = list.size() - 1;
            while (right >= 0) {

                list.remove(right);
                right = right - 2;
                System.out.println(list);

            }
            return helper(list, !flag);
        }

        // for (int i = 0; i < list.size(); i++) {
        // if (i % 2 == 0) {
        // list.remove(i);
        // }
        // }
        // System.out.println(list);
        // return helper(list);

    }
}
