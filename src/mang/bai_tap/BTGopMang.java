package mang.bai_tap;

import java.util.Scanner;

public class BTGopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[2];
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập phần tử  " + (i + 1) + " của mảng a : ");
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            System.out.print("Nhập phần tử  " + (j + 1) + " của mảng b : ");
            b[j] = sc.nextInt();
        }
        int pos = 0;
        for (int element : a) {
            c[pos] = element;
            pos++;
        }
        for (int element : b) {
            c[pos] = element;
            pos++;
        }
        System.out.println("Mảng c : ");
        for (int element : c) {
            System.out.print(element + " ");
        }
    }
}
