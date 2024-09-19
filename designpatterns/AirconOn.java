public class AirconOn implements Command{
    private Aircon airconOn;

    public AirconOn(Aircon airconOn){
        this.airconOn=airconOn;
    }

    @Override
    public void execute() {
        airconOn.AirconTurnOn();
    }
}
