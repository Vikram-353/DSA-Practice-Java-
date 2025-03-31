package Prime_num;

public class Prime {
    public static void main(String[] args) {
        int n = 40;

        for (int i = 2; i < n; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
