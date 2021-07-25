package abstractclass_interface.bai_tap;

public class Square implements Resizeable {
    private double length;
    private double width;

    Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void resize(double percent) {
        double S = length * width + ((length * width * percent) / 100);
        System.out.println("Diện tích hình vuông: " + (length * width));
        System.out.println("Diện tích hình vuông sau khi tăng lên " + percent + "% :" + S);
    }
}
