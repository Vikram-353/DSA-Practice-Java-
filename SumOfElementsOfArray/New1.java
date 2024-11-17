package SumOfElementsOfArray;

public class New1 {
    public static void main(String[] args) {
        int sum;
        sum = 0;
        int[] arr1 = { 54, 85, 28, 85, 4 };
        // int[] arr1;
        // arr1=new int[5]
        int n;
        n = arr1.length;
        for (int i = 0; i < n; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);

    }
}
