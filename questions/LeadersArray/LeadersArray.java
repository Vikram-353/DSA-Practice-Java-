package questions.LeadersArray;

import java.util.ArrayList;

public class LeadersArray {
    public static void main(String[] args) {
        int[] a = { 4, 7, 1, 0 };
        int n = a.length;
        ArrayList<Integer> result = new ArrayList<>();

        int maxFromRight = a[n - 1];
        result.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > maxFromRight) {
                maxFromRight = a[i];
                result.add(maxFromRight);
            }
        }

        reverse(result);

        System.out.println(result);
    }

    private static void reverse(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
