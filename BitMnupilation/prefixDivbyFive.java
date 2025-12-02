package BitMnupilation;

import java.util.ArrayList;
import java.util.List;

public class prefixDivbyFive {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        System.out.println(prefixesDivBy5(nums));
    }

    public static List<Boolean> prefixesDivBy5(int[] nums) {
        // ArrayList<Boolean> result = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        //     int num = 0;
        //     int ind = 0;
        //     for (int j = i; j >= 0; j--) {
        //         num = num + nums[j] * (int) (Math.pow(2, ind));
        //         ind++;
        //     }
        //     list.add(num);
        // }

        // for (Integer integer : list) {
        //     if (integer % 5 == 0) {
        //         result.add(true);
        //     } else {
        //         result.add(false);
        //     }
        // }
        // return result;

        List<Boolean> result = new ArrayList<>();
        int current = 0;

        for (int bit : nums) {
            current = ((current << 1) + bit) % 5;
            result.add(current == 0);
        }

        return result;
    }
}
