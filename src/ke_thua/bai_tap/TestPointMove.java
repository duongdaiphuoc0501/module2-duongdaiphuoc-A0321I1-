package ke_thua.bai_tap;

public class TestPointMove {
    public static void main(String[] args) {
        Point moveablePoint = new MoveablePoint(1, 2, 3, 4);
        System.out.println(moveablePoint);
        System.out.println(((MoveablePoint)moveablePoint).move());
    }
}
