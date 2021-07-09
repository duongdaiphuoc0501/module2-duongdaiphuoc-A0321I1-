package vong_lap.bai_tap;

import java.util.Scanner;

public class BTHienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while(count < numbers){
            if (isPrimeNumber(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
