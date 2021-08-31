package case_study.models;

public class Contract {
    private String idContract;
    private Booking booking;
    private String pre;
    private String pay;
    private Customer customer;

    public Contract() {
    }

    public Contract(String idContract, Booking booking, String pre, String pay, Customer customer) {
        this.idContract = idContract;
        this.booking = booking;
        this.pre = pre;
        this.pay = pay;
        this.customer = customer;
    }

    public String getIdContract() {
        return this.idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getBooking() {
        return this.booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getPre() {
        return this.pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getPay() {
        return this.pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", booking=" + booking +
                ", pre='" + pre + '\'' +
                ", pay='" + pay + '\'' +
                ", customer=" + customer +
                '}';
    }
}
