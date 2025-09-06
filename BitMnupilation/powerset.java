package BitMnupilation;

import java.util.ArrayList;

public class powerset {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3 };
        PowerSetNum(num);
    }

    public static void PowerSetNum(int[] num) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = num.length;
        for (int i = 0; i < 1 << n; i++) {
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    list2.add(num[j]);
                }
            }
            list.add(list2);
        }
        System.out.println(list);

    }

}
