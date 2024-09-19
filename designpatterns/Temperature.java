public class Temperature implements Command{
    private Aircon aircon;
    private int temperature;
    public Temperature (Aircon aircon, int temperature) {
        this.aircon = aircon;
        this.temperature=temperature;
    }

    @Override
    public void execute() {
        aircon.setTemperature(temperature);
    }
}
