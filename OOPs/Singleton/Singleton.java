package OOPs.Singleton;

public class Singleton {
    private Singleton() {
        System.out.println("Vikram");
    };

    private static Singleton instance;

    public static Singleton getinstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
