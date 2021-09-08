package main.java.gof.adapter;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 file: " + fileName);
        }else if (audioType.equalsIgnoreCase("vlc")
            || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, audioType);
        }else {
            System.out.println("invalid media： " + audioType);
        }
    }
}
