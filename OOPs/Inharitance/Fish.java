package OOPs.Inharitance;

class Fish extends Species {
    public boolean canSwim;;

    Fish(int age, boolean canSwim) {
        super(0);
        this.canSwim = canSwim;
    }

    Fish(boolean haveGills, boolean haveLungs, boolean canSwim) {
        super(haveGills, haveLungs);
        this.canSwim = canSwim;

    }

}