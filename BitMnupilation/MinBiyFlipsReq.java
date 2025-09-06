package BitMnupilation;

public class MinBiyFlipsReq {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;
        int result = num1 ^ num2;
        System.out.println(Integer.bitCount(result));
        System.out.println(bitCounts(result));
    }

    private static int bitCounts(int n) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            count += n & 1;
            n = n >> 1;
        }
        if (n == 1) {
            count++;
        }
        return count;
    }
}
