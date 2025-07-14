package sum;

public class prac2 {
    public static void main(String[] args) {
        int result = 0;
        long n = 987554321;
        while (n > 0) {
            n = n / 10;
            result++;
        }
        System.out.println(result);
        System.out.println(1 > 0);
    }
}
