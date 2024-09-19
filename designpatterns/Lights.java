public class Lights {
    private String color;
    private int brightness = 0;


    public void TurnOn() {
        System.out.println("Light is Turned On!");
    }
    public void TurnOff() {
        System.out.println("Light is Turned Off!");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Brightness level: " + brightness);
    }

    public void setColor(String color){
        this.color = color;
        System.out.println("Color: "+color);
    }


}
