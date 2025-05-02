package questions.Dice;

public class Dice {
    public static void main(String[] args) {
        DiceMe("", 4);

    }

    static void DiceMe(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            DiceMe(p + i, target - i);
        }
    }
}
