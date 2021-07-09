package mang.bai_tap;

import java.util.Scanner;

public class BTXoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1, 4, 6, 2, 3, 7, 8, 9, 11};
        int[] b = new int[arr.length-1];
        System.out.println("Nhap phan tu muon xoa");
        int x = scanner.nextInt();
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != x){
                b[j] = arr[i];
                j++;
            }
        }
        for(int k = 0; k < arr.length; k++){
            System.out.println(b[k]);
        }
    }
}
