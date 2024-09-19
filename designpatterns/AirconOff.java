public class AirconOff implements Command {
        private Aircon AirconOff;

        public AirconOff(Aircon AirconOff){
            this.AirconOff=AirconOff;
        }

        @Override
        public void execute() {
            AirconOff.AirconTurnOff();

    }

}
