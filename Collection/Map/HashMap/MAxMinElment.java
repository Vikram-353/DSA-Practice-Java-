package Map.HashMap;

import java.util.HashMap;

public class MAxMinElment {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 3, 4, 5, 3, 3, 4, 3, 2, 4, 4, 3, 2 };
        MaxMin(arr);

    }

    static void MaxMin(int[] arr) {
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
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;
        int minElement = -1;
        int maxElement = -1;

        for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFrequency) {
                maxFrequency = freq;
                maxElement = key;
            }

            if (freq < minFrequency) {
                minFrequency = freq;
                minElement = key;
            }

        }
        System.out.println("Max frequency and Max Value are " + maxFrequency + " and " + maxElement);
        System.out.println("Min frequency and Min Value are " + minFrequency + " and " + minElement);
    }
}
