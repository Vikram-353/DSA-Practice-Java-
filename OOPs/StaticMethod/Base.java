package OOPs.StaticMethod;

public class Base {
    public static void main(String[] args) {
        Human Vikram = new Human("Vikram", 21);
        Human Krishna = new Human("Krishna", 21);

        System.out.println(Human.population);
        System.out.println(Vikram.name + " " + Vikram.age);
        System.out.println(Krishna.name + " " + Krishna.age);
    }
}
