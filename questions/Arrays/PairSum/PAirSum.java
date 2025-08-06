package questions.Arrays.PairSum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class PAirSum {
    public static void main(String[] args) {
        int[] nums = { 31, 25, 72, 79, 74 };
        System.out.println(maxSum(nums));
    }

    public static int maxSum(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int maxInteger = maxInteger(nums[i]);
            map.put(nums[i], maxInteger);
        }

        System.out.println(map);
        int count = 0;
        int maxCommon = Collections.max(map.values());

        System.out.println(maxCommon);
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == maxCommon) {
                newArray.add(nums[i]);
                count++;
            }
        }

        System.out.println(newArray);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < newArray.size(); i++) {
            int current = newArray.get(i);

            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
        sum = largest + secondLargest;
        if (count >= 2) {
            return sum;
        }
        return -1;
    }

    public static int maxInteger(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = num;
        while (n != 0) {
            arr.add(n % 10);
            n = n / 10;
        }

        return Collections.max(arr);
    }

}
