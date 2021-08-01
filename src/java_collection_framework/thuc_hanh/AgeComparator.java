package java_collection_framework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<StudentComparable> {
    public static void main(String[] args) {
        StudentComparable student = new StudentComparable("Kien", 30, "HT");
        StudentComparable student1 = new StudentComparable("Nam", 26, "HN");
        StudentComparable student2 = new StudentComparable("Anh", 38, "HT");
        StudentComparable student3 = new StudentComparable("Tung", 38, "HT");

        List<StudentComparable> lists = new ArrayList<StudentComparable>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (StudentComparable st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (StudentComparable st : lists) {
            System.out.println(st.toString());
        }
    }

    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}
