
package questions.Arrays.NextPermutation;

public class NextPermutation {
    public static void main(String[] args) {
        int[] a = { 2, 1, 5, 4, 3, 0, 0 };
        int n = a.length;
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind != -1) {
            for (int i = n - 1; i > ind; i--) {
                if (a[i] > a[ind]) {
                    swap(a, i, ind);
                    break;
                }
            }
        }

        reverse(a, ind + 1, n - 1);

        // Print the result
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] a, int i, int ind) {
        int temp = a[i];
        a[i] = a[ind];
        a[ind] = temp;
    }

    public static void reverse(int[] a, int i, int j) {
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }
}
