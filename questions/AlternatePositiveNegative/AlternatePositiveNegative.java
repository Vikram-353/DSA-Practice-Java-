package questions.AlternatePositiveNegative;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        int[] a = { 3, 1, -2, -5, 2, -4 };
        // int[] positive = new int[a.length / 2];
        // int[] negative = new int[a.length / 2];
        // int p = 0;
        // int l = 0;
        // for (int i = 0; i < a.length; i++) {

        // if (a[i] < 0) {
        // negative[p] = a[i];
        // p++;
        // }
        // if (a[i] > 0) {
        // positive[l] = a[i];
        // l++;
        // }
        // }

        // int r = 0;
        // int t = 0;
        // for (int i = 0; i < a.length; i++) {

        // if (i % 2 == 0) {
        // a[i] = positive[r];
        // r++;
        // } else {
        // a[i] = negative[t];
        // t++;
        // }
        // }

        // better approach
        int negative = 1, positive = 0;
        int[] arr = new int[a.length];
        for (int i = 0; i < arr.length; i++) {
            if (a[i] < 0) {
                arr[negative] = a[i];
                negative += 2;
            } else {
                arr[positive] = a[i];
                positive += 2;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

        // int num = 0;
        // for (int i = 1; i < a.length; i++) {
        // if (a[i - 1] < 0) {
        // num = nextPositive(i, a);
        // int temp = a[i];
        // a[i] = a[num];
        // a[num] = temp;
        // }
        // if (a[i - 1] > 0) {
        // num = nextNegative(i, a);
        // int temp = a[i];
        // a[i] = a[num];
        // a[num] = temp;
        // }
        // }
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }
    }

    // public static int nextPositive(int i, int[] a) {
    // for (int j = i; j < a.length; j++) {
    // if (a[j] > 0) {
    // return j;
    // }

    // }
    // return -1;
    // }

    // public static int nextNegative(int i, int[] a) {
    // for (int j = i; j < a.length; j++) {
    // if (a[j] < 0) {
    // return j;
    // }

    // }
    // return -1;
    // }
}
