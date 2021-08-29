package case_study.models;

public class Customer extends Person {
    private String address;
    private String typeOfCustomer;
    private Facility services;

    public Customer() {
    }

    public Customer(int id, String name, int age, String idcard, String sex, String email, String address, String typeOfCustomer) {
        super(id, name, age, idcard, sex, email);
        this.address = address;
        this.typeOfCustomer = typeOfCustomer;
    }

    public Customer(String address, String typeOfCustomer) {
        this.address = address;
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return this.typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", id=" + id +
                ", mame='" + mame + '\'' +
                ", age=" + age +
                ", idcard='" + idcard + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
