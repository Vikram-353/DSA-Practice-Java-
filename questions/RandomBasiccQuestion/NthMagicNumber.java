package questions.RandomBasiccQuestion;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(n == 0 ? false : (n & (n - 1)) == 0);// fix for n=0
        System.out.println(ans(n));

    }

    static int ans(int n) {
        int ans = 0;
        int base = 5;
        int digit = (int) (Math.log(n) / Math.log(2));

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += base * last;
            base = base * 5;

        }
        System.out.println(digit + 1);

        return ans;
    }
}
