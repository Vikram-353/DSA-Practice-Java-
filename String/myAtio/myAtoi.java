// package String.myAtio;

// public class myAtoi {
//     public static void main(String[] args) {
//         String s = "91283472332";
//         System.out.println(myatio(s.trim()));
//         // System.out.println((int) (s.charAt(0)));
//     }

//     public static int myatio(String s) {
//         final int INT_MAX = (int) Math.pow(2, 32);
//         final int INT_MIN = (int) Math.pow(-2, 32);

//         int result = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (i == 0 && s.charAt(i) == '-') {
//                 continue;
//             }

//             if (48 > (s.charAt(i)) || (s.charAt(i)) > 57) {
//                 break;
//             }
//             result = (result * 10 + (s.charAt(i)) - 48);
//         }

//         if (result > INT_MAX) {
//             result = INT_MAX;
//         }
//         if (result < INT_MIN) {
//             result = INT_MIN + 1;
//         }

//         // result = s.charAt(0) == '-' ? 0 - (result) : result;
//         if (s.charAt(0) == '-') {
//             result = 0 - result;
//         }

//         return result;
//     }
// }

package String.myAtio;

public class myAtoi {
    public static void main(String[] args) {
        String s = "+32";
        System.out.println(myatio(s.trim()));
    }

    public static int myatio(String s) {
        s = s.trim();
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        int result = 0;
        boolean isNegative = false;

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                isNegative = true;
                continue;
            }
            if (i == 0 && s.charAt(i) == '+') {
                continue;
            }

            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';

            if (result > (INT_MAX - digit) / 10) {
                return isNegative ? INT_MIN : INT_MAX;
            }

            result = result * 10 + digit;
        }

        return isNegative ? -result : result;
    }
}
