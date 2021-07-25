package danh_sach.bai_tap;

import java.util.ArrayList;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Phuoc");
        Student s2 = new Student(2, "Dai Phuoc");
        Student s3 = new Student(3, "Duong Dai Phuoc");

        MyList<Student> studentMyListmyList = new MyList<>();
        studentMyListmyList.add(s1);
        studentMyListmyList.add(s2);
        studentMyListmyList.add(s3);
    }
}
