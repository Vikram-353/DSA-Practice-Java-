package sum;

import java.util.Scanner;

/**
 * Sum
 */
public class Sum {

    public static void main(String[] args) {
        SumNumber();

    }

    public static void SumNumber() {
        int num1, num2, sumNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        num1 = sc.nextInt();
        System.out.print("Enter second number");
        num2 = sc.nextInt();
        sumNum = num1 + num2;
        System.out.println("Sum of given numbers are: " + sumNum);
        sc.close();
        System.out.println("hello");

    }

}
