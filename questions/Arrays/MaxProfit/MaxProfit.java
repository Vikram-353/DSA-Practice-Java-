package questions.Arrays.MaxProfit;

public class MaxProfit {
    public static void main(String[] args) {
        int[] a = { 7, 1, 5, 3, 6, 4 };

        // Basic Approach
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int profit = 0;
            for (int j = i + 1; j < a.length; j++) {
                profit = a[j] - a[i];
                if (profit >= maxProfit) {

                    maxProfit = profit;
                }
            }
        }
        System.out.println(maxProfit);

        // Better approach
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (minPrice >= a[i]) {
                minPrice = a[i];
            }
            if (a[i] - minPrice >= maxProfit) {
                maxProfit = a[i] - minPrice;
            }
        }
        System.out.println(maxProfit);

        // Optimal Approach
        int res = 0, buy = Integer.MAX_VALUE;
        for (int price : a) {
            res = Math.max(res, price - buy);
            buy = Math.min(buy, price);
        }
        System.out.println(res);

    }
}
