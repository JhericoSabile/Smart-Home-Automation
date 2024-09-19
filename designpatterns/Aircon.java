public class Aircon {

    private int temperature = 0;

    void AirconTurnOn(){
        System.out.println("Aircon is On!");
    }
    void AirconTurnOff(){
        System.out.println("Aircon is OFF!");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature: " + temperature);
    }

}
