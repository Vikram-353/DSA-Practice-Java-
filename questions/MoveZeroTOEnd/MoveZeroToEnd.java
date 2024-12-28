package questions.MoveZeroTOEnd;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 4, 0, 3, 0, 2, 5 };
        int[] arr2 = new int[arr.length];
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[p] = arr[i];
                p++;
            } else {
                arr[p] = 0;
            }
        }
        for (int i : arr2) {
            System.out.println(i);
        }

        // Note :: Do IT THROUGH INPLACE TECHNIQUE

    }
}
