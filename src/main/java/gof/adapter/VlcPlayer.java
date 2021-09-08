package main.java.gof.adapter;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
