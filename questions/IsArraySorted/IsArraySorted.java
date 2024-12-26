package questions.IsArraySorted;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10 };
        // int[] arr = { 2 };
        int flag = 0;
        if (arr.length == 1) {
            flag = 0;
        } else {
            for (int i = 1; i <= arr.length - 1; i++) {
                if (arr[i - 1] > arr[i]) {
                    flag = 1;
                    break;
                }

            }
        }
        if (flag == 1) {
            System.out.println("Not Sorted");
        } else {
            System.out.println("Sorted");
        }

    }
}
