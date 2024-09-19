public class Main {
    public static void main(String[] args) {

        Lights l = new Lights();
        MusicPlayer Mp = new MusicPlayer();
        Aircon Ac = new Aircon();

        Command SwitchTurnOn= new SwitchTurnOn(l);
        Command AirconOn = new AirconOn(Ac);
        Command AirconOff = new AirconOff(Ac);
        Command Brightness = new Brightness(l, 4);
        Command Color = new Color(l, "Green");
        Command MusicPlay= new MusicPlay(Mp);
        Command increaseVolume = new IncreaseVolume(Mp);
        Command decreaseVolume = new DecreaseVolume(Mp);
        Command Temperature = new Temperature(Ac, -22);

        SmartHome Centralhub = new SmartHome();

        Centralhub.setCommand(SwitchTurnOn);
        Centralhub.pressButton();
        Centralhub.setCommand(Brightness);
        Centralhub.pressButton();
        Centralhub.setCommand(Color);
        Centralhub.pressButton();
        Centralhub.setCommand(MusicPlay);
        Centralhub.pressButton();
        Centralhub.setCommand(decreaseVolume);
        Centralhub.pressButton();
        Centralhub.setCommand(AirconOn);
        Centralhub.pressButton();
        Centralhub.setCommand(Temperature);
        Centralhub.pressButton();







    }
}
