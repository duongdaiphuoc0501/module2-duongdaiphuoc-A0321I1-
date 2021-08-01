package java_collection_framework.thuc_hanh;

public class StudentComparable implements Comparable<StudentComparable> {
    private String name;
    private Integer age;
    private String address;

    public StudentComparable(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentComparable student) {
        return this.getName().compareTo(student.getName());
    }
}
