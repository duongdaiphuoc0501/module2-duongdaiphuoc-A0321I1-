package mang.bai_tap;

import java.util.Scanner;

public class BTTimPhanTuLonNhatTrongMangHaiChieu {
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
        float max = a[0][0];
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < a[0].length; n++) {
                if (a[m][n] > max) {
                    max = a[m][n];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều a: " + max);
    }
}
