package questions.ChecSortedAndRotated;

public class SortedAfterRotaion {

    // The approach:
    // 1.Go through the array and find the point where nums[i] is greater than
    // nums[i + 1]. This indicates a potential rotation point.
    // 2.If there is more than one rotation point, return false.
    // 3.If there is exactly one rotation point, confirm that the remainder of the
    // array is in non-decreasing order.
    // 4.Lastly, make sure that the last element of the array is less than or equal
    // to the first element.

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };// Or [2,1,3,4]

        int countDrops = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countDrops++;
                if (countDrops > 1) {
                    System.out.println(false);
                }
            }
        }

        System.out.println(true);
    }
}
