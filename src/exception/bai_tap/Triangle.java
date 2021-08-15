package exception.bai_tap;

public class Triangle extends Exception {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle(String string) {
        super(string);
    }

    public void ExceptionTriangle(Triangle triangle) throws Triangle {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Triangle("Lỗi tổng 2 cạnh tam giác nhỏ hơn cạnh còn lại.");
        } else if (a <= 0 || b <= 0 || c <= 0) {
            throw new Triangle("Cạnh tam giác không tồn tại số âm;");
        } else {
            System.out.println("Tam giác hợp lệ.");
        }
    }
}
