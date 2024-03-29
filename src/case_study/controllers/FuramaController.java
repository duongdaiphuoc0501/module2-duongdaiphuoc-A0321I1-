package case_study.controllers;

import java.lang.reflect.Method;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

           if(choice == 1){
               System.out.println("1. Display list employees");
               System.out.println("2. Add new employee");
               System.out.println("3. Edit employee");
               System.out.println("4. Return main menu");
           } else if(choice == 2){
               System.out.println("1. Display list customers");
               System.out.println("2. Add new customer");
               System.out.println("3. Edit customer");
               System.out.println("4. Return main menu");
           } else if (choice == 3){
               System.out.println("1. Display list facility");
               System.out.println("2. Add new facility");
               System.out.println("3. Display list facility maintenance");
               System.out.println("4. Return main menu");
           } else if (choice == 4){
               System.out.println("1. Add new booking");
               System.out.println("2. Display list booking");
               System.out.println("3. Create new constracts");
               System.out.println("4. Display list contracts");
               System.out.println("5. Edit contracts");
               System.out.println("6. Return main menu");
           } else if (choice == 5){
               System.out.println("1. Display list customers use service");
               System.out.println("2. Display list customers get voucher");
               System.out.println("3. Return main menu");
           } else {
               System.exit(0);
           }
        }
    }
}
