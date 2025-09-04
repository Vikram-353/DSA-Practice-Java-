package questions.OrdersFriends;

import java.util.*;

public class OrdersFriends {
    public static void main(String[] args) {
        int[] orders = { 3, 1, 2, 5, 4 };
        int[] friends = { 1, 3, 4 };
        int[] result = recoverOrder(orders, friends);
        System.out.println(Arrays.toString(result));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }
        for (int i = 0; i < order.length; i++) {
            if (map.containsKey(order[i])) {
                list.add(order[i]);
            }
        }
        System.out.println(list);
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        System.out.println(map);
        return result;
    }
}
