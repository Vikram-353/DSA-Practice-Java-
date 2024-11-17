import java.util.Scanner;

public class program_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println(sum);
        sc.close();
    }
}