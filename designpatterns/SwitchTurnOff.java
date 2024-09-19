public class SwitchTurnOff implements Command {
    private Lights light;

    public SwitchTurnOff(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.TurnOff();
    }
}