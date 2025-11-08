package OOPs.Interface;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electrinc Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electrinc Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Electrinc Engine accelerates");
    }
}
