package lop_va_doituong.bai_tap;

public class BTFan {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(ClassFan.fast, true, 10, "yellow");
        ClassFan fan2 = new ClassFan(ClassFan.medium, false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
