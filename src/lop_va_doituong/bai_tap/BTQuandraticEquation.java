package lop_va_doituong.bai_tap;

import java.util.Scanner;

public class BTQuandraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        ClassQuadraticEquation pt = new ClassQuadraticEquation(a, b, c);
        if(delta < 0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if (delta == 0){
            System.out.println("Phương trình có 1 nghiệm duy nhất: " + pt.getRoot1());
        }
        else {
            System.out.println("Phương trình có 2 nghiệm phân biệt: " + pt.getRoot1() + ", " + pt.getRoot2());
        }
    }
}
