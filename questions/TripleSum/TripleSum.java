// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.

// Constraints:

// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105

package questions.TripleSum;

import java.util.*;

public class TripleSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        // List<List<Integer>> result = threeSum(nums);
        // List<List<Integer>> result = threeSumHash(nums);
        List<List<Integer>> result = threeSumOptimize(nums);
        System.out.println(result);
    }

    static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k) {
                        List<Integer> list = new ArrayList<>();

                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        Collections.sort(list); // Sort triplet to avoid duplicates
                        if (!result.contains(list)) {
                            result.add(list);
                        }
                    }

                }

            }

        }
        return result;

    }

    static List<List<Integer>> threeSumHash(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> seenTriplets = new HashSet<>();
        Arrays.sort(nums); // sort for better handling duplicates

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);

                if (seen.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet); // sort triplet to handle uniqueness

                    String key = triplet.toString();
                    if (!seenTriplets.contains(key)) {
                        result.add(triplet);
                        seenTriplets.add(key);
                    }
                }

                seen.add(nums[j]);
            }
        }
        return result;
    }

    static List<List<Integer>> threeSumOptimize(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1])
                        j++;
                    // Skip duplicate `right`
                    while (j < k && nums[k] == nums[k - 1])
                        k--;

                    j++;
                    k--;
                }
            }

        }
        return result;
    }

}
