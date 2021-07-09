package lop_va_doituong.bai_tap;

public class ClassQuadraticEquation {
    private double a;
    private double b;
    private double c;

    public ClassQuadraticEquation(){

    }

    public ClassQuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getRoot1() {
        return (-b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);

    }

    public double getRoot2() {
        return (b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
    }

}
