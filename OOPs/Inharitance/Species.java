package OOPs.Inharitance;

public class Species {
    public int age;

    Species(int age) {
        this.age = age;
    }

}

class Human extends Species {
    public int height;

    Human(int age, int height) {
        super(0);
        this.height = height;
    }
}

class Fish extends Species {
    public boolean canSwim;;

    Fish(int age, boolean canSwim) {
        super(0);
        this.canSwim = canSwim;
    }
}
