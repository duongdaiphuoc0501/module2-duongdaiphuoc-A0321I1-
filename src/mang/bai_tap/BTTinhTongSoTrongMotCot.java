package mang.bai_tap;

import java.util.Scanner;

public class BTTinhTongSoTrongMotCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] a = new float[3][2];
        System.out.println("Nhập phần tử mảng 2 chiều a: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Nhập cột cần tính tổng: ");
        int b = sc.nextInt();
        float tong = 0.0f;
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < a[0].length; n++) {
               if(n == b){
                   tong += a[m][b];
               }
            }
        }
        System.out.println("Tổng là: " + tong);
    }
}
