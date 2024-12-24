package Map.HashMap;

import java.util.HashMap;

public class HMCreate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 2, 4, 2, 4, 6, 4 };
        CreateHashMap(arr);
    }

    static void CreateHashMap(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer n = hm.get(arr[i]);
            if (n == null) {
                hm.put(arr[i], 1);

            } else {
                hm.put(arr[i], n + 1);
            }

        }
        System.out.println(hm);
    }
}
