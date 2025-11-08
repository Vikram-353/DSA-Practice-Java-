package OOPs.Interface;

public class MediaPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Media Player starts");
    }

    @Override
    public void stop() {
        System.out.println("Media Player stops");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }
}
