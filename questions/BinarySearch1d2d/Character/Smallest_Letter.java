package questions.BinarySearch1d2d.Character;

public class Smallest_Letter {
    public static void main(String[] args) {

        char[] letters = { 'c', 'f', 'd' };
        char k = 'a';
        int low = 0;
        int high = letters.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // maybe an answer
            if (letters[mid] > k) {

                high = mid - 1;

            } else {
                low = mid + 1;
            }

        }
        System.out.println(letters[low % letters.length]);
        ;

    }
}
