package introductionjava.Bai_tap;

import java.util.Scanner;

public class BT_ChuyenTien {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá tiền usd: ");
        double usd = scanner.nextDouble();
        double vnd = 23000*usd;
        System.out.println("Giá tiền vnd" + vnd);
    }
}
