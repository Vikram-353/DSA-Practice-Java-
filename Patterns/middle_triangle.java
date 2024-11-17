// package Patterns;

// public class middle_triangle {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5 - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < 2 * i - 1; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 0; j < 5 - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println(" ");
//         }

//     }
// }

package Patterns;

public class middle_triangle {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
