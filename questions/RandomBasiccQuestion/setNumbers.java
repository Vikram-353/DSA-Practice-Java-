package questions.RandomBasiccQuestion;

public class setNumbers {
    public static void main(String[] args) {
        int n = 5;
        int a = 3;
        int b = 9;
        int ans = 0;

        System.out.println(Integer.toBinaryString(n));
        while (n > 0) {
            ans++;
            n = n & (n - 1);

        }
        System.out.println(ans);

        // XOR till a
        System.out.println(a % 4);

        System.out.println(XOR(b) ^ XOR(a - 1));
    }

    static int XOR(int a) {
        if (a % 4 == 0) {
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return a + 1;
        } else {

            return 0;
        }
    }
}
