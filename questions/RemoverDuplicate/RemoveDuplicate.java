package questions.RemoverDuplicate;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 2, 2, 3, 3, 3, 4, 4, 6, 6, 6 };
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[count] != arr[i]) {

                count = count + 1;
                arr[count] = arr[i];
            }

            // for (int j = i + 1; j < arr.length; j++) {
            // if (arr[i] != arr[j]) {
            // arr[j] = 0;
            // count++;
            // }
            // }
        }

        // for (int i : arr) {
        // System.out.println(i);

        // }
        System.out.println(count + 1);

    }

}
