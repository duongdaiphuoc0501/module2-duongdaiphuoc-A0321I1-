package stack_queue.bai_tap;

import java.util.Stack;

public class ChuyenDoiCoSo {
    public static void main(String[] args) {
        ChuyenThapPhanThanhNhiPhan(5);
    }

    public static void ChuyenThapPhanThanhNhiPhan(int so) {
        Stack<Integer> stack = new Stack<>();
        int du;
        while (so != 0) {
            du = so % 2;
            so /= 2;
            stack.push(du);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
