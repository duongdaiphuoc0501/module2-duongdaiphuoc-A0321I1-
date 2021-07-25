package mang.bai_tap;

import java.util.Scanner;

public class BTTinhTongDuongCheoChinh {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }

//        for (int i = 0; i < n; i++) {
//            sum += a[i][n - 1 - i];
//        }
        System.out.println("Tổng đường chéo chính: " + sum);
    }
}
