package OOPs.Interface;

public class NiceCar {

    private Engine engine;
    private MediaPlayer mediaPlayer = new MediaPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void MediaStart() {
        mediaPlayer.start();
    }

    public void MediaStop() {
        mediaPlayer.stop();
    }

    public void updateEngine() {
        this.engine = new ElectricEngine();
    }

}
