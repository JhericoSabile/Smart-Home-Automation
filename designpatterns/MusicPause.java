public class MusicPause implements Command {
        private MusicPlayer musicPlayer;

        public MusicPause(MusicPlayer musicPlayer){
            this.musicPlayer =musicPlayer;
        }

        @Override
        public void execute() {
            musicPlayer.pause();
        }
    }


