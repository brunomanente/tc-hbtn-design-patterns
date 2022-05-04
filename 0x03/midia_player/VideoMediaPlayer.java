public class VideoMediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void reproduzirVlc(String VLC) {
        System.out.print("Reproduzindo VLC: " + VLC);
    }

    @Override
    public void reproduzirMp4(String MP4) {
        System.out.print("Reproduzindo MP4: " + MP4);
    }

}
