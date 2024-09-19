public class IncreaseVolume implements Command{
    private MusicPlayer IncreaseVolume;

    public IncreaseVolume(MusicPlayer IncreaseVolume) {
        this.IncreaseVolume = IncreaseVolume;
    }

    public void execute() {
        IncreaseVolume.increaseVolume();
    }
}


