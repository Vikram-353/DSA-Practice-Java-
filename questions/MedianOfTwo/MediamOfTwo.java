package questions.MedianOfTwo;

public class MediamOfTwo {
    public static void main(String[] args) {
        int[] a = { 1, 3 };
        int[] b = { 2 };
        System.out.println(MergeSort(a, b));
    }

    static double MergeSort(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int[] num = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                num[k] = a[i];
                i++;

            } else {
                num[k] = b[j];
                j++;

            }
            k++;
        }

        while (i < n1) {
            num[k] = a[i];
            i++;
            k++;
        }
        while (j < n2) {
            num[k] = b[j];
            j++;
            k++;
        }

        int n3 = num.length;

        if (n3 == 1) {
            return num[0];
        } else if (n3 % 2 == 0 && n3 > 0) {
            return (num[Mid(0, n3) - 1] + num[Mid(0, n3)]) / 2.0;
        } else if (n3 % 2 != 0) {
            return num[Mid(0, n3)];
        }

        return -1;

    }

    static int Mid(int start, int end) {
        return start + (end - start) / 2;
    }

}

// public static void main(String[] args) {
// double[] a = { 2, 2, 4, 4 };
// double[] b = { 2, 2, 2, 4, 4 };
// double result = Median(a, b);
// System.out.println(result);

// }

// static double Median(double[] a, double[] b) {

// int n1 = a.length;
// int n2 = b.length;
// double num1 = 0, num2 = 0;
// double result = 0;

// if (n1 == 1) {
// num1 = a[0];
// } else if (n1 % 2 == 0 && n1 > 0) {
// num1 = (a[Mid(0, n1) - 1] + a[Mid(0, n1)]) / 2;
// } else if (n1 % 2 != 0) {
// num1 = a[Mid(0, n1) - 1];
// }

// if (n2 == 1) {
// num2 = b[0];
// } else if (n2 % 2 == 0 && n2 > 0) {
// num2 = (b[Mid(0, n2) - 1] + b[Mid(0, n2)]) / 2;
// } else if (n2 % 2 != 0) {
// num2 = b[Mid(0, n2) - 1];
// }

// if (n1 == 0 || n2 == 0) {
// result = num1 + num2;
// return result;
// }
// result = (num1 + num2) / 2;

// return result;

// }
