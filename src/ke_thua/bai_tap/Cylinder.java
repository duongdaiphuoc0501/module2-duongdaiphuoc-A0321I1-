package ke_thua.bai_tap;

public class Cylinder {
    private double radius;
    private double high;
    private String color;

    public Cylinder(){

    }

    public Cylinder(double radius, double high, String color) {
        this.radius = radius;
        this.high = high;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHigh() {
        return this.high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double S(){
        return this.radius*this.radius*Math.PI;
    }

    public double V(){
        return this.radius*this.radius*Math.PI*this.high;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", high=" + high +
                ", color='" + color + '\'' +
                ", S=" + S() +
                ", V=" + V() +
                '}';
    }
}
