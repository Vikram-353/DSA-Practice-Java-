package questions.Arrays.FindMissing;

public class FindMissing {
    public static void main(String[] args) {
        int[] arr = { 2, 19, 10, 1, 5, 3, 13, 18, 24, 23, 9, 22, 28, 25, 6, 27, 4, 20, 21, 26, 11, 8, 17, 15, 16, 12, 7,
                14 };
        int N = 29;

        // for (int i = 1; i <= N; i++) {
        // int flag = 0;
        // for (int j = 0; j < N - 1; j++) {
        // if (arr[j] == i) {
        // flag = 1;

        // break;
        // }
        // }
        // if (flag == 0) {
        // System.out.println(i);
        // }
        // }

        // Optimal approach
        int S1 = (N * (N + 1)) / 2;
        int S2 = 0;
        for (int i = 0; i < arr.length; i++) {
            S2 += arr[i];
        }
        System.out.println(S1 - S2);
    }
}
