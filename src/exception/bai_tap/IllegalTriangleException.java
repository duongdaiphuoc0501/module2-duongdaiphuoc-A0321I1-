package exception.bai_tap;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5, 3);
        try {
            triangle.ExceptionTriangle(triangle);
        } catch (Triangle e){
            System.out.println(e.getMessage());
        }
    }
}
