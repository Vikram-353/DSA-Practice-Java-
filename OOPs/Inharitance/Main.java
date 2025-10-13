package OOPs.Inharitance;

public class Main {

    public static void main(String[] args) {
        Human Human = new Human(0, 0);
        Human.age = 100;
        System.out.println(Human.age);
        Human.height = 6;
        System.out.println(Human.height);
        Fish fish = new Fish(0, false);
        fish.age = 2;
        fish.canSwim = true;
        System.out.println(fish.age + " " + fish.canSwim);

    }
}
