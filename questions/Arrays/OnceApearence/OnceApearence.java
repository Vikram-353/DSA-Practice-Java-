package questions.Arrays.OnceApearence;

public class OnceApearence {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 4, 4, 5 };

        // -----------------approach 1-----------------
        // HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // for (int num : arr) {
        // frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        // }

        // // Print frequencies

        // for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        // if (entry.getValue() == 1) {
        // System.out.println(entry.getKey());
        // }
        // }

        // ------------------aproach 2--------------
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }
}
