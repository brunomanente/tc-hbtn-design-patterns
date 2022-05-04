public class MediaPlayerAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia ) {
        if(!tipoMedia.equals(TipoMedia.MP3))
        this.advancedMediaPlayer = new VideoMediaPlayer();
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        if(tipoMedia.equals(TipoMedia.VLC)){
            advancedMediaPlayer.reproduzirVlc(nome);
        }
        else if (tipoMedia.equals(TipoMedia.MP4)){
            advancedMediaPlayer.reproduzirMp4(nome);
        }
    }
}
