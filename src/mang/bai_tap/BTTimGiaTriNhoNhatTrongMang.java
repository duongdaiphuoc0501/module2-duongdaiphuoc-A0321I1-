package mang.bai_tap;

import java.util.Scanner;

public class BTTimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("arr[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j] < min) {
                min = a[j];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng a: " + min);
    }
}
