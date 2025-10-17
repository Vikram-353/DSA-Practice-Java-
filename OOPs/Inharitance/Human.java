package OOPs.Inharitance;

class Human extends Species {
    public int height;

    Human(int age, int height) {
        super(0);
        this.height = height;
    }

    Human(boolean haveGills, boolean haveLungs, int height) {
        super(haveGills, haveLungs);
        this.height = height;
    }
}
