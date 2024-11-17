package questions;

public class ReverseBinar {
    public static void main(String[] args) {
        long binary = 0;
        long n = 3;
        long[] arr = new long[32];
        long decimal = 0;
        long power = 0;
        for (int i = 0; i < 32; i++) {
            binary = n % 2;
            n = n / 2;
            arr[i] = binary;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            decimal += arr[i] * Math.pow(2, power);
            power++;
        }

        System.out.println(decimal);
    }
}
