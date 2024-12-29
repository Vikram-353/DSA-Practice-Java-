package questions.UnionArray;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr2 = { 2, 4, 5, 7 };
        int[] arr = new int[Math.max(arr1.length, arr2.length)];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr[i] = arr1[i];
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
