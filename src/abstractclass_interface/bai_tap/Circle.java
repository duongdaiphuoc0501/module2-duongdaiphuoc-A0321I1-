package abstractclass_interface.bai_tap;

public class Circle implements Resizeable {
    private double radius;

    Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        double S = (radius * radius * Math.PI ) + ((radius * radius * Math.PI * percent) / 100);
        System.out.println("Diện tích hình tròn: " + (radius * radius * Math.PI ));
        System.out.println("Diện tích hình tròn sau khi tăng lên " + percent + "% :" + S);
    }
}
