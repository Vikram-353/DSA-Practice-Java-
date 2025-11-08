package OOPs.Interface;

public class Car implements Engine, Media {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Start car");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stop Car");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        System.out.println("Pause Car");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("Accelerate Car");
    }
}
