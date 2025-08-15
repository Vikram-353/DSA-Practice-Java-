package questions.BinarySearch1d2d.ShipWithinday;

public class ShipWithinday {
    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 1, 1 };
        int days = 4;
        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int sum = 0;
        for (int i : weights) {
            maxWeight += i;
            sum = Math.max(sum, i);
        }
        boolean flag = false;
        int low = sum;
        int high = maxWeight;
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            flag = weightCount(mid, weights, days);
            if (flag) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static boolean weightCount(int weight, int[] weights, int days) {
        int day = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > weight) {
                day++;
                load = 0;
            }
            load += weights[i];

        }
        return day <= days;
    }
}
