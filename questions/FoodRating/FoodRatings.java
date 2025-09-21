package questions.FoodRating;

import java.util.HashMap;

public class FoodRatings {
    public static void main(String[] args) {
        String[] foods = { "kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi" };
        String[] cuisines = { "korean", "japanese", "japanese", "greek", "japanese", "korean" };
        int[] ratings = { 9, 12, 8, 15, 14, 7 };
        FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
        obj.changeRating("kimchi", 5);
        String param_2 = obj.highestRated("japanese");
        System.out.println(param_2);
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            map.put(foods[i], ratings[i]);
        }

        System.out.println(map);
    }

    public void changeRating(String food, int newRating) {

    }

    public String highestRated(String cuisine) {
        String rating = "moussaka";

        return rating;
    }
}
