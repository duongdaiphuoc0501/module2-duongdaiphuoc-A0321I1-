package case_study.models;

public class Person {
    protected int id;
    protected String mame;
    protected int age;
    protected String idcard;
    protected String sex;
    protected String email;

    public Person() {
    }

    public Person(int id, String mame, int age, String idcard, String sex, String email) {
        this.id = id;
        this.mame = mame;
        this.age = age;
        this.idcard = idcard;
        this.sex = sex;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMame() {
        return this.mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdcard() {
        return this.idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
