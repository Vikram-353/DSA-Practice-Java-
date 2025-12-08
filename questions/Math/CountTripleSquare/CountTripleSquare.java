package questions.Math.CountTripleSquare;

public class CountTripleSquare {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countTriples(n));
    }

    public static int countTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.pow(k, 2) == (Math.pow(i, 2) + Math.pow(j, 2))) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
