package lop_va_doituong.bai_tap;

public class BTStopWatch {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        ClassStopWatch sw = new ClassStopWatch();
        int arr[] = new int[100000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100000);
        }
        sw.Start();
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
        sw.Stop();
        System.out.println("Thời gian thực hiện: " + sw.getElapsedTime());
    }
}
