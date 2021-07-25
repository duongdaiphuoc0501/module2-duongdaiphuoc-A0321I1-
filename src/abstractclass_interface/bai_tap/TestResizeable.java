package abstractclass_interface.bai_tap;

public class TestResizeable {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(1.2);
        resizeables[1] = new Rectangle(3,5);
        resizeables[2] = new Square(9,2);
        for (Resizeable resizeable:
             resizeables) {
                resizeable.resize(11);
        }
    }
}
