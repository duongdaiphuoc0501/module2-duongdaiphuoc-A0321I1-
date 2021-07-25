package lop_va_doituong.thuc_hanh;

import java.util.Scanner;

public class THLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        ClassHinhChuNhat hcn = new ClassHinhChuNhat(width, height);
        System.out.println("Your Rectangle \n"+ hcn.display());
        System.out.println("Perimeter of the Rectangle: "+ hcn.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hcn.getArea());
    }
}
