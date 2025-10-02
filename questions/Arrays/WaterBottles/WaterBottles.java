package questions.Arrays.WaterBottles;

public class WaterBottles {
    public static void main(String[] args) {
        int numBottles = 13;
        int numExchange = 6;
        System.out.println(maxBottlesDrunk(numBottles, numExchange));
    }

    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        if (numBottles < numExchange) {
            return numBottles;
        }
        int totalDrinks = numBottles;
        int empty = numBottles;
        int b = 0;

        while (empty >= numExchange) {

            if (empty > numExchange) {
                empty = empty - numExchange;
                b = b + 1;
                numExchange++;
            }
            if (empty < numExchange && b != 0) {
                totalDrinks = totalDrinks + b;
                empty = empty + b;
                b = 0;
            }
            if (empty == numExchange) {
                b = b + 1;
                empty = 0;
                numExchange++;
                totalDrinks = totalDrinks + b;

            }
        }

        return totalDrinks;

    }

    // public static int maxBottlesDrunk(int numBottles, int numExchange) {
    // if (numBottles < numExchange) {
    // return numBottles;
    // }
    // int totalDrinks = numBottles;
    // int empty = numBottles;
    // while (empty >= numExchange) {
    // int d = empty / numExchange;
    // totalDrinks = totalDrinks + d;
    // empty = d + (empty % numExchange);
    // }

    // return totalDrinks;

    // }

}
