package questions.Arrays.IsOneBitCharachter;

import java.util.HashMap;

public class IsOneBitCharachter {
    public static void main(String[] args) {
        int[] bits = { 0 };
        System.out.println(isOneBitCharacter(bits));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 2) {
            if (bits[0] == 0 && bits[1] == 1) {
                return false;
            }
            if (bits[0] == 1 && bits[1] == 1) {
                return false;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < bits.length; i++) {
            map.put(bits[i], map.getOrDefault(bits[i], 0) + 1);
        }

        int countZero = map.getOrDefault(0, 0);
        int countOne = map.getOrDefault(1, 0);
        if (countOne == 3 * countZero
                || (bits.length >= 3 && bits[bits.length - 2] == 1 && bits[bits.length - 1] == 0)) {
            return false;
        }

        return true;
    }
}
