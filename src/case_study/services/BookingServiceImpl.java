package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Villa;
import case_study.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService{
    private static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        customerList.add(new Customer(1, "phuoc", 20, "1028492831", "male", "phuoc@gmail.com", "QN", "VIP"));
        customerList.add(new Customer(2, "phuc", 20, "1028381000", "male", "phuc@gmail.com", "QN", "NORMAL"));

        facilityIntegerMap.put(new Villa("1", "Villa 1", 200, 150, 10, "Day", "VIP", 15, 2), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 2", 300, 500, 15, "Day", "VIP", 15, 2), 0);
    }

    public Set<Booking> sendBooking(){
        return bookingSet;
    }
    @Override
    public void addBooking() {
        int id = 1;
        if(bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhap ngay bat dau thue: ");
        String startDate = scanner.nextLine();
        System.out.println("Nhap ngay tra phong: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);

        bookingSet.add(booking);
        System.out.println("Da booking thanh cong");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking: bookingSet){
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer(){
        System.out.println("Danh sach khach hang");
        for (Customer customer:
             customerList) {
            System.out.println(customer.toString());
        }

        System.out.println("Nhap id khach hang");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());

        while (check){
            for (Customer customer:
                 customerList) {
                if(id == customer.getId()){
                    check = false;
                    return customer;
                }
            }
            if(check){
                System.out.println("Ban da nhap sai, vui long nhap lai id khach hang");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        System.out.println("Danh sach dich vu");
        for (Map.Entry<Facility, Integer> entry:
                facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }

        System.out.println("Nhap id dich vu");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<Facility, Integer> entry:
                    facilityIntegerMap.entrySet()) {
                if(id.equals(entry.getKey().getId())){
                    check = false;
                    return entry.getKey();
            }
            }
            if(check){
                System.out.println("Ban da nhap sai, vui long nhap lai id dich vu");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
