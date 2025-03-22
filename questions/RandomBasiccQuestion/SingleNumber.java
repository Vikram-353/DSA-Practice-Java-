package questions.RandomBasiccQuestion;

public class SingleNumber {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 1, 4, 3, 5 };
        System.out.println(findSingleNumber(a));
    }

    static int findSingleNumber(int[] a) {
        int result = 0;
        // for (int i : a) {
        // result = result ^ i;
        // }

        for (int i = 0; i < a.length; i++) {
            result = result ^ a[i];
        }
        return result;
    }
}
