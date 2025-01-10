package questions.Arrays.AppearsMoreThanN;

// import java.util.HashMap;
// import java.util.Map;

public class AppearsMoreThanN {
    public static void main(String[] args) {
        int[] arr = { 6, 6, 6, 7, 7 };
        // Map<Integer, Integer> arrSum = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // Integer n = arrSum.get(arr[i]);
        // if (n == null) {
        // arrSum.put(arr[i], 1);
        // } else {
        // arrSum.put(arr[i], n + 1);
        // }
        // }
        // int result = 0;

        // for (HashMap.Entry<Integer, Integer> entry : arrSum.entrySet()) {
        // int key = entry.getKey();
        // int freq = entry.getValue();
        // if (freq >= (arr.length / 2)) {
        // result = key;

        // }
        // }
        // System.out.println(result);

        // ------------------optimal Approach----------------
        // Moose Voting algorithm
        int element = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else {

                count--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.println(element);
        }

    }
}
