package questions.RandomBasiccQuestion;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] a = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        a = reverseArray(a);

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            // System.out.print(" ");
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    static int[][] reverseArray(int[][] a) {
        // int s = 0;

        for (int i = 0; i < a[0].length; i++) {
            int e = a[0].length - 1;
            int s = 0;
            while (s < e) {
                int temp = a[i][s];
                a[i][s] = a[i][e];
                a[i][e] = temp;
                s++;
                e--;

            }

        }
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = 1 - a[i][j];

            }

        }
        return a;
    }
}
