package questions;

import java.util.*;

public class factors {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(Factors(n));

    }

    static ArrayList<Integer> Factors(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // a.add(i);
        // }
        // }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                a.add(i);
                a.add(n / i);
            }
        }

        return a;
    }
}
