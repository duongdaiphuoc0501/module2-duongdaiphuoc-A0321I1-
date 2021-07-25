package mang.bai_tap;

import java.util.Scanner;

public class BTThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 6, 5, 9, 2};
        int[] b = new int[arr.length + 1];
        System.out.println("Nhập phần tử cần chèn");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn cần chèn");
        int index = sc.nextInt();
        if (index <= 1 || index >= b.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        }
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }
        for (int j = b.length - 1; j >= index; j--) {
                b[j] = b[j - 1];
        }
        b[index - 1] = x;
        for(int k = 0; k < b.length; k++){
            System.out.print(b[k] + " ");
        }
    }
}
