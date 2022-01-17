public class Wheel {
    String position;
    String color;
    float diameter;
    float width;
    private Tire tire = new Tire();
    private Rim rim = new Rim();
    private Screw[] screws = new Screw[4];

    Wheel(String position, String color, float diameter, float width) {
        this.position = position;
        this.color = color;
        this.diameter = diameter;
        this.width = width;
    }
}