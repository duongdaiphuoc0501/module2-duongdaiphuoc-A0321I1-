package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;

import java.util.*;

public class ContractServiceImpl implements ContractService{
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booling:
             bookingSet) {
            bookingQueue.add(booling);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("Dang tao hop dong cho booking co thong tin: " + booking.toString());
            System.out.println("Dang tao hop dong cho customer co thong tin: " + customer.toString());
            System.out.println("Nhap id hop dong: ");
            String id = scanner.nextLine();
            System.out.println("Nhap so tien tra truoc: ");
            String pre = scanner.nextLine();
            System.out.println("Nhap so chi phi: ");
            String pay = scanner.nextLine();

            Contract contract = new Contract(id, booking, pre, pay, customer);
            contractList.add(contract);
            System.out.println("Da tao hop dong thanh cong: " + contract.toString());
        }
    }

    @Override
    public void displayListContract() {
        for (Contract contract:
             contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {

    }
}
