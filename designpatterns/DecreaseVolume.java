public class DecreaseVolume implements Command {
    private MusicPlayer DecreaseVolume;

    public DecreaseVolume(MusicPlayer DecreaseVolume) {
        this.DecreaseVolume = DecreaseVolume;
    }

    @Override
    public void execute() {
        DecreaseVolume.decreaseVolume();
    }
}