public class MusicPlay implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlay(MusicPlayer musicPlayer){
        this.musicPlayer =musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.play();
    }
}
