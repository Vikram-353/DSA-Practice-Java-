package OOPs.Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.start();
        car.stop();
        car.pause();

        NiceCar car2 = new NiceCar();
        car2.start();
        car2.MediaStart();
        car2.updateEngine();
        car2.start();
    }
}
