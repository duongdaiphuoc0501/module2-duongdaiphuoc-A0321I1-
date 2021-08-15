package thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    static int[] list = {19, 83, 92, 1, 4, 6, 32, 75, 3, 9, 2};
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int l:
             list) {
            System.out.println(l);
        }
    }
}
