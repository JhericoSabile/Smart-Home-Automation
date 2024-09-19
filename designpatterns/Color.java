public class Color implements Command {
    private Lights light;
    private String color;


    public Color(Lights light, String color){
        this.light=light;
        this.color=color;
    }

    @Override
    public void execute() {
        light.setColor(color);
    }
}
