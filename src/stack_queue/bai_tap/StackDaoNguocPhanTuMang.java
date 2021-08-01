package stack_queue.bai_tap;

import java.util.Stack;

public class StackDaoNguocPhanTuMang {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void reverse(int array[]){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        for(int j = 0; j < array.length; j++){
            array[j] = stack.pop();
        }
    }
}
