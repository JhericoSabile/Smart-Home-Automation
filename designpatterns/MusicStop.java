public class MusicStop implements Command{
        private MusicPlayer musicPlayer;

        public MusicStop(MusicPlayer musicPlayer){
            this.musicPlayer =musicPlayer;
        }

        public void execute() {
            musicPlayer.stop();
        }


}
