package Patterns;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        int n = 5;
        // System.out.println(Sum(n));
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - n % i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = n - (n % i); j <= n + (n % i); j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
        // triangle(n);
        // invertedTriangle(n);
        // TriangleRecursion(5, 0);

        // square(n);
        tri01(n);

        boolean[] lights = new boolean[100];
        System.out.println(switchOn(lights));
    }

    static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - n % i; j++) {
                System.out.print(" ");
            }
            for (int j = n - (n % i); j <= n + (n % i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

    static void tri01(int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            if (i % 2 == 0) {
                flag = true;
            } else {
                flag = false;
            }
            for (int j = 0; j < i; j++) {

                if (flag == false) {
                    System.out.print(1);

                } else {
                    System.out.print(0);

                }
                flag = !flag;

            }

            System.out.println();

        }
    }

    static void TriangleRecursion(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            TriangleRecursion(r, c + 1);
            System.out.print("*");

        } else {
            TriangleRecursion(r - 1, 0);
            System.out.println();

        }

    }

    public static int Sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + Sum(n - 1);
    }

    static int switchOn(boolean[] lights) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = lights.length;
        int people = 100;
        int count = 0;
        for (int i = 0; i < people; i++) {
            for (int j = 0; j < n; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    lights[j] = !lights[j];
                }
            }
        }
        for (int i = 0; i < lights.length; i++) {
            if (lights[i]) {
                count++;
                list.add(i + 1);
            }
        }
        System.out.println(list);
        return count;

    }
}
