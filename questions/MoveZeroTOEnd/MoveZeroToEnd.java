package questions.MoveZeroTOEnd;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        // int[] arr2 = new int[arr.length];
        // int p = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != 0) {
        // arr2[p] = arr[i];
        // p++;
        // } else {
        // arr[p] = 0;
        // }
        // }
        // for (int i : arr2) {
        // System.out.println(i);
        // }

        // Note :: Do IT THROUGH INPLACE TECHNIQUE
        int j = arr.length + 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // Move to the next zero position
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }

    }
}
