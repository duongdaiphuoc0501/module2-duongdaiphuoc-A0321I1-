package vong_lap.bai_tap;

import java.util.Scanner;

public class BTHienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. Vẽ hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                   for(int i = 0; i < 3; i++){
                       for(int j = 0; j < 5; j++){
                           System.out.print("* ");
                       }
                       System.out.println("");
                   }
                    break;
                case 2:
                    for(int i = 0; i < 5; i++) {
                        for(int j = 0; j <= i; j++)
                            System.out.print("* ");

                        System.out.println("");
                    }
                    break;
                case 3:
                    for(int i = 0; i < 5; i++) {
                        for(int j = 5; j > i; j--)
                            System.out.print("* ");

                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
