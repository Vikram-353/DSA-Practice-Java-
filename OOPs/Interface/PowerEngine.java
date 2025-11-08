package OOPs.Interface;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Power Wngine start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine accelerates");
    }
}
