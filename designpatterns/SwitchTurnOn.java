public class SwitchTurnOn implements Command {
    private Lights light;
    public SwitchTurnOn(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.TurnOn();
    }
}