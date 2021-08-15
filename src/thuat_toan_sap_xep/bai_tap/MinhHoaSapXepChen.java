package thuat_toan_sap_xep.bai_tap;

public class MinhHoaSapXepChen {
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int array:
             arr) {
            System.out.println(array);
        }
    }

    public static void main(String[] args) {
        MinhHoaSapXepChen insertionsort = new MinhHoaSapXepChen();
        int arr[] = {19, 83, 92, 1, 4, 6, 32, 75, 3, 9, 2};
        insertionsort.insertionSort(arr);
    }
}
