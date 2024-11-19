package Recirsion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed array: ");
        revArr(0, arr);
        sc.close();
    }

    static void revArr(int i, int[] arr) {
        if (i == arr.length) {
            return;
        }
        revArr(i + 1, arr);
        System.out.print(arr[i] + " ");

    }
}
