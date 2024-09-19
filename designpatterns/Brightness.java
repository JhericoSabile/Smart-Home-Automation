public class Brightness implements Command {
    private Lights light;
    private int brightness;

    public Brightness(Lights light, int brightness) {
        this.light = light;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        light.setBrightness(brightness);
    }
}