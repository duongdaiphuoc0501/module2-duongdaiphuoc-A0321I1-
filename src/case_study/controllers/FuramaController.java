package case_study.controllers;


import case_study.commons.*;
import case_study.exceptions.*;
import case_study.models.*;
import case_study.services.*;

import java.util.*;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    public static String VILLA = "villa";
    public static String HOUSE = "house";
    public static String ROOM = "room";
    public static String CUSTOMER = "customer";
    public static String BOOKING = "booking";
    public static String EMPLOYEE = "employee";


    public static void main(String[] args) {
        FuramaController.displayMenu();
    }

    public static void displayMenu() {
        int choice = -1;
        do {
            System.out.println("1.Employee Management" +
                    "\n2.Customer Management" +
                    "\n3.Facility Management " +
                    "\n4.Booking Managerment" +
                    "\n5.Promotion Management" +
                    "\n6.Exit");
            System.out.print("Enter choice : ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                System.out.println("Nhap sai. Vui long nhap lai.");
            }

            switch (choice) {
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    displayBooking();
                    break;
                case 5:
                    displayPromotion();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayMenu();
            }
        } while (true);
    }
    public static void displayEmployee(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choice = -1;
        do {
            System.out.println("1.Display list employees" +
                    "\n2.Add new employee" +
                    "\n3.Edit employee" +
                    "\n4.Delete employee" +
                    "\n5.Return main menu");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
                case 5:
                    displayMenu();
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayEmployee();
            }
        } while (true);
    }
    public static void displayCustomer(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choice = -1;
        do {
            System.out.println("1.Display list customers" +
                    "\n2.Add new customer" +
                    "\n3.Edit customer" +
                    "\n4.Return main menu");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMenu();
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayCustomer();
            }
        } while (true);
    }

    public static void displayFacility(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choice = -1;
        do {
            System.out.println("1.Display list facility" +
                    "\n2.Add new facility" +
                    "\n3.Edit facility" +
                    "\n4.Return main menu");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:

                    break;
                case 4:
                    displayMenu();
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayFacility();
            }
        } while (true);
    }
    public static void addNewFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choice = -1;
        do {
            System.out.println("1.Add new villa" +
                    "\n2.Add new house" +
                    "\n3.Add new room" +
                    "\n4.Return main menu");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    displayMenu();
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayFacility();
            }
        } while (true);
    }

    public static void displayBooking(){
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        int choice = -1;
        do {
            System.out.println("1.Display list booking" +
                    "\n2.Add new booking" +
                    "\n3.Create new contracts" +
                    "\n4.Display list contracts" +
                    "\n5.Edit contracts" +
                    "\n6.Return main menu");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    bookingService.displayListBooking();
                    break;
                case 2:
                    bookingService.addBooking();
                    break;
                case 3:
                    contractService.createNewContract();
                    break;
                case 4:
                    contractService.displayListContract();
                    break;
                case 5:
                    contractService.editContract();
                    break;
                case 6:
                    displayMenu();
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayBooking();
            }
        } while (true);
    }
    public static void displayPromotion(){
        int choice = -1;
        do {
            System.out.println("1.Display list customers use service" +
                    "\n2.Display list customers get voucher" +
                    "\n3.Return main menu");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    displayMenu();
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayPromotion();
            }
        } while (true);
    }

}
