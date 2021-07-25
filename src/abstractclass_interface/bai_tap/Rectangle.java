package abstractclass_interface.bai_tap;

public class Rectangle implements Resizeable {
    private double height;
    private double bottomEdge;

    Rectangle() {
    }

    public Rectangle(double height, double bottomEdge) {
        this.height = height;
        this.bottomEdge = bottomEdge;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBottomEdge() {
        return this.bottomEdge;
    }

    public void setBottomEdge(double bottomEdge) {
        this.bottomEdge = bottomEdge;
    }

    @Override
    public void resize(double percent) {
        double S = ((height * bottomEdge) / 2) + (((height * bottomEdge * percent) / 2) / 100);
        System.out.println("Diện tích hình tam giác: " + (height * bottomEdge) / 2);
        System.out.println("Diện tích hình tam giác sau khi tăng lên " + percent + "% :" + S);
    }
}
