package questions.Math.PersonReach;

public class PersonReach {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int z = 3;
        System.out.println(findClosest(x, y, z));
    }

    public static int findClosest(int x, int y, int z) {
        int result = 0;
        int a = Math.abs(z - x);
        int b = Math.abs(z - y);
        if (a < b) {
            result = 1;
        }
        if (a > b) {
            result = 2;

        }

        if (a == b) {
            result = 0;
        }

        return result;
    }
}
