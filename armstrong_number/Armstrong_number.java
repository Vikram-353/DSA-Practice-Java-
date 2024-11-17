package armstrong_number;

public class Armstrong_number {
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);

            }
        }
    }

    public static boolean isArmstrong(int n) {
        int rem, cube;
        int number = n;
        int sum = 0;
        while (number > 0) {
            rem = number % 10;
            cube = rem * rem * rem;
            sum += cube;
            number = number / 10;
        }
        return sum == n;

    }
}

// javac armstrong_number/Armstrong_number.java
