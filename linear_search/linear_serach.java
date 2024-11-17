package linear_search;

public class linear_serach {
    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 3, 5, 7, 9, 4 };
        int token = 4;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == token) {
                System.out.println(i);

            }
        }
    }
}
