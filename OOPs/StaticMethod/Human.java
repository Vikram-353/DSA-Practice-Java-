package OOPs.StaticMethod;

public class Human {
    String name;
    int age;
    static int population;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        Human.population += 1;
    }
}
