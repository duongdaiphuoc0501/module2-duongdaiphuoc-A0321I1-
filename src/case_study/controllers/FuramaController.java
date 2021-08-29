package case_study.controllers;


import case_study.commons.*;
import case_study.exceptions.*;
import case_study.models.*;
import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;

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
            choice = Integer.parseInt(sc.nextLine());
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
                    "\n4.Return main menu");
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

                    break;
                case 4:
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
                    //showService();
                    break;
                case 2:
                    //addNewServices();
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
    public static void displayBooking(){
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

                    break;
                case 2:
                    //addNewBooking();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

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

//    public static void showQueueOfCustomer() {
//        Queue<Customer> queueCustomer = new LinkedList<>();
//        List<Customer> listOfCustomer = readAllCustomer(CUSTOMER);
//        showAllCustomer(CUSTOMER);
//        queueCustomer.add(listOfCustomer.get(1));
//
//        Customer customer = null;
//        System.out.println("--------------------------");
//        System.out.println("List customer who buy ticket : ");
//        while (!queueCustomer.isEmpty()) {
//            customer = queueCustomer.poll();
//            customer.showInfo();
//        }
//    }
//
////    public static Map<String, Person> readAllEmployee(String fileName) {
////        FuncFileCSV.setFullPathFile(fileName);
////        List<String> propertiesEmployee = FuncFileCSV.readFile();
////        Map<String, Person> mapOfEmployee = new HashMap<>();
////        String[] arrayProperties = null;
////        Person employee = null;
////        for (String properties : propertiesEmployee) {
////            arrayProperties = properties.split(StringUtils.COMMA);
////            employee = new Person();
////            employee.setId(arrayProperties[0]);
////            employee.setFullName(arrayProperties[1]);
////            employee.setBirthday(arrayProperties[2]);
////            employee.setAddress(arrayProperties[3]);
////
////            mapOfEmployee.put(employee.getId(), employee);
////        }
////        return mapOfEmployee;
////    }
//
//    public static void showInformationOfEmployee() {
//        Map<String, Person> mapOfEmployee = readAllEmployee(EMPLOYEE);
//        System.out.println("-------------------");
//        System.out.println("LIST EMPLOYEE ");
//        for (Map.Entry<String, Person> employeeEntry : mapOfEmployee.entrySet()) {
//            System.out.println(employeeEntry.getKey() + " " + employeeEntry.getValue().toString());
//        }
//    }
//
//    public static void addNewBooking() {
//        List<Customer> listOfCustomer = readAllCustomer(CUSTOMER);
//        showAllCustomer(CUSTOMER);
//        System.out.println("Please enter Customer to booking!");
//        int isCustomer = Integer.parseInt(sc.nextLine());
//
//        System.out.println("1. Booking Villa" +
//                "\n2. Booking House" +
//                "\n3. Booking Room");
//        System.out.print("Please enter type Service : ");
//        int isTypeService = Integer.parseInt(sc.nextLine());
//        List<Facility> listOfService = null;
//        switch (isTypeService) {
//            case 1:
//                listOfService = readAllService(VILLA);
//                showAllService(VILLA);
//                break;
//            case 2:
//                listOfService = readAllService(HOUSE);
//                showAllService(HOUSE);
//                break;
//            case 3:
//                listOfService = readAllService(ROOM);
//                showAllService(ROOM);
//                break;
//        }
//        System.out.println("Please choose service to booking : ");
//        int isService = Integer.parseInt(sc.nextLine());
//
//        Customer customer = listOfCustomer.get(isCustomer - 1);
//        customer.setServices(listOfService.get(isService - 1));
//
//        FuncFileCSV.setFullPathFile(BOOKING);
//        FuncFileCSV.writeFile(new String[]{customer.toString()});
//        System.out.println("BOOKING is done!");
//    }
//
//    public static List<Customer> readAllCustomer(String fileName) {
//        FuncFileCSV.setFullPathFile(fileName);
//        List<String> propertiesCustomer = FuncFileCSV.readFile();
//        List<Customer> listOfCustomer = new ArrayList<>();
//        String[] arrayPropertiesCustomer = null;
//        Customer customer = null;
//        for (String property : propertiesCustomer) {
//            arrayPropertiesCustomer = property.split(StringUtils.COMMA);
//            customer = new Customer();
//            customer.setFullName(arrayPropertiesCustomer[0]);
//            customer.setDateOfBirth(arrayPropertiesCustomer[1]);
//            customer.setGender(arrayPropertiesCustomer[2]);
//            customer.setIdCard(arrayPropertiesCustomer[3]);
//            customer.setPhoneNumber(arrayPropertiesCustomer[4]);
//            customer.setEmail(arrayPropertiesCustomer[5]);
//            customer.setAddress(arrayPropertiesCustomer[6]);
//            customer.setTypeOfCustomer(arrayPropertiesCustomer[7]);
//
//            listOfCustomer.add(customer);
//        }
//        Collections.sort(listOfCustomer);
//        return listOfCustomer;
//    }
//
//    public static void showInformationOfCustomer() {
//        int choice = -1;
//        do {
//            System.out.println("1.Show all Villa" +
//                    "\n2.Show all House" +
//                    "\n3.Show all Room" +
//                    "\n4.Show all Name Villa not Duplicate" +
//                    "\n5.Show all Name House not Duplicate" +
//                    "\n6.Show all Name Room not Duplicate" +
//                    "\n7.Back to menu" +
//                    "\n8.Exit");
//            System.out.print("Please enter your choice : ");
//            choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    showAllCustomer(VILLA);
//                    break;
//                case 2:
//                    showAllCustomer(HOUSE);
//                    break;
//                case 3:
//                    showAllCustomer(ROOM);
//                    break;
//                case 4:
//                    showAllCustomerDuplicate(VILLA);
//                    displayMenu();
//                    break;
//                case 5:
//                    showAllCustomerDuplicate(HOUSE);
//                    displayMenu();
//                    break;
//                case 6:
//                    showAllCustomerDuplicate(ROOM);
//                    displayMenu();
//                    break;
//                case 7:
//                    displayMenu();
//                    break;
//                case 8:
//                    System.exit(0);
//                default:
//                    System.out.println("Fail !! You must choice again..");
//                    sc.nextLine();
//                    addNewServices();
//            }
//        } while (true);
//    }
//
//    public static void showAllCustomerDuplicate(String fileName) {
//        Set<String> setOfCustomer = new TreeSet<>();
//
//        System.out.println("---------------------------------");
//        System.out.println("List Customer not Duplicate : ");
//        for (Customer customer : readAllCustomer(fileName)) {
//            setOfCustomer.add(customer.getDateOfBirth());
//        }
//
//        for (String name : setOfCustomer) {
//            System.out.println(name);
//        }
//    }
//
//    public static void showAllCustomer(String fileName) {
//        System.out.println("-------------------");
//        System.out.println("LIST CUSTOMER ");
//        List<Customer> listOfCustomer = readAllCustomer(fileName);
//
//        Customer customer = null;
//        for (int i = 0; i < listOfCustomer.size(); i++) {
//            customer = listOfCustomer.get(i);
//            System.out.println((i + 1) + ". ");
//            customer.showInfo();
//        }
//    }
//
//    public static void addNewCustomer(String fileName) {
//        boolean flag;
//
//        String fullName = null;
//        do {
//            flag = true;
//            System.out.print("Please enter full name : ");
//            fullName = sc.nextLine();
//            try {
//                Validator.isValidName(fullName);
//            } catch (NameException e) {
//                flag = false;
//                e.printStackTrace();
//            }
//        } while (!flag);
//
//        String dateOfBirth = null;
//        do {
//            flag = true;
//            System.out.print("Please enter dateOfBirth : ");
//            dateOfBirth = sc.nextLine();
//
//            try {
//                Validator.isValidBirthday(dateOfBirth);
//            } catch (BirthdayException e) {
//                flag = false;
//                e.printStackTrace();
//            }
//        } while (!flag);
//
//        String gender = null;
//        do {
//            flag = true;
//            System.out.print("Please enter gender : ");
//            gender = sc.nextLine();
//
//            try {
//                Validator.isValidGender(gender);
//            } catch (GenderException e) {
//                flag = false;
//                e.printStackTrace();
//            }
//        } while (!flag);
//        gender = ConvertUtils.normalizeStr(gender);
//
//        String idCard = null;
//        do {
//            flag = true;
//            System.out.print("Please enter id card : ");
//            idCard = sc.nextLine();
//
//            try {
//                Validator.isValidIdCard(idCard);
//            } catch (IdCardException e) {
//                flag = false;
//                e.printStackTrace();
//            }
//        } while (!flag);
//
//        System.out.print("Please enter numberPhone : ");
//        String numberPhone = sc.nextLine();
//
//        String email = null;
//        do {
//            flag = true;
//            System.out.print("Please enter email : ");
//            email = sc.nextLine();
//
//            try {
//                Validator.isValidEmail(email);
//            } catch (EmailException e) {
//                flag = false;
//                e.printStackTrace();
//            }
//        } while (!flag);
//
//        System.out.print("Please enter address : ");
//        String address = sc.nextLine();
//
//        System.out.print("Please enter typeOfCustomer : ");
//        String typeOfCustomer = sc.nextLine();
//
//        FuncFileCSV.setFullPathFile(fileName);
//        FuncFileCSV.writeFile(new String[]{fullName, dateOfBirth, gender, idCard, numberPhone, email, address, typeOfCustomer});
//    }
//
//    //convert tat ca cac line trong file .csv thanh kieu object
//    public static List<Facility> readAllService(String fileName) {
//        FuncFileCSV.setFullPathFile(fileName);
//        List<String> propertiesService = FuncFileCSV.readFile();
//        List<Facility> listOfService = new ArrayList<>();
//
//        String[] propertiesElement = null;
//        ExtraService serviceExtra = null;
//        Facility services = null;
//
//        for (String properties : propertiesService) {
//            propertiesElement = properties.split(StringUtils.COMMA);
//            if (fileName.equals(VILLA)) {
//                services = new Villa();
//
//                ((Villa) services).setRoomStandard(propertiesElement[6]);
//                ((Villa) services).setUtilityDescription(propertiesElement[7]);
//                ((Villa) services).setPoolArea(Double.parseDouble(propertiesElement[8]));
//                ((Villa) services).setFloor(Integer.parseInt(propertiesElement[9]));
//
//            } else if (fileName.equals(HOUSE)) {
//                services = new House();
//
//                ((House) services).setStandardRoom(propertiesElement[6]);
//                ((House) services).setUtilityDescription(propertiesElement[7]);
//                ((House) services).setFloor(Integer.parseInt(propertiesElement[8]));
//            } else if (fileName.equals(ROOM)) {
//                serviceExtra = new ExtraService(propertiesElement[6], Integer.parseInt(propertiesElement[7]), Double.parseDouble(propertiesElement[8]));
//                services = new Room();
//
//                ((Room) services).setExtraService(serviceExtra);
//            }
//
//            services.setId(propertiesElement[0]);
//            services.setServiceName(propertiesElement[1]);
//            services.setUsedArea(Double.parseDouble(propertiesElement[2]));
//            services.setRentPrice(Double.parseDouble(propertiesElement[3]));
//            services.setNumberPeople(Integer.parseInt(propertiesElement[4]));
//            services.setRentType(propertiesElement[5]);
//
//            listOfService.add(services);
//        }
//        return listOfService;
//    }
//
//    public static void showService() {
//        int choice = -1;
//        do {
//            System.out.println("1.Show all Villa" +
//                    "\n2.Show all House" +
//                    "\n3.Show all Room" +
//                    "\n4.Show all Name Villa not Duplicate" +
//                    "\n5.Show all Name House not Duplicate" +
//                    "\n6.Show all Name Room not Duplicate" +
//                    "\n7.Back to menu" +
//                    "\n8.Exit");
//            System.out.print("Please enter your choice : ");
//            choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    showAllService(VILLA);
//                    break;
//                case 2:
//                    showAllService(HOUSE);
//                    break;
//                case 3:
//                    showAllService(ROOM);
//                    break;
//                case 4:
//                    showAllServiceVillaDuplicate(VILLA);
//                    displayMenu();
//                    break;
//                case 5:
//                    showAllServiceVillaDuplicate(HOUSE);
//                    displayMenu();
//                    break;
//                case 6:
//                    showAllServiceVillaDuplicate(ROOM);
//                    displayMenu();
//                    break;
//                case 7:
//                    displayMenu();
//                    break;
//                case 8:
//                    System.exit(0);
//                default:
//                    System.out.println("Fail !! You must choice again..");
//                    sc.nextLine();
//                    addNewServices();
//            }
//        } while (true);
//    }
//
//    private static void showAllServiceVillaDuplicate(String fileName) {
//        Set<String> setOfService = new TreeSet<>();
//
//        System.out.println("---------------------------------");
//        System.out.println("List Service not Duplicate : ");
//        for (Facility services : readAllService(fileName)) {
//            setOfService.add(services.getServiceName());
//        }
//
//        for (String name : setOfService) {
//            System.out.println(name);
//        }
//    }
//
//    private static void showAllService(String fileName) {
//        System.out.println("---------------------------------");
//        System.out.println("List Service: ");
//        List<Facility> listOfService = readAllService(fileName);
//        Facility services = null;
//
//        for (int i = 0; i < listOfService.size(); i++) {
//            services = listOfService.get(i);
//            System.out.println((i + 1) + ". ");
//            services.showInfo();
//        }
//
//    }
//
//    public static void addNewServices() {
//        int choice = -1;
//        do {
//            System.out.println("1.Add new Villa" +
//                    "\n2.Add new House" +
//                    "\n3.Add new Room" +
//                    "\n4.Back to menu" +
//                    "\n5.Exit");
//            System.out.print("Please enter service choice : ");
//            choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    addNewService(VILLA);
//                    break;
//                case 2:
//                    addNewService(HOUSE);
//                    break;
//                case 3:
//                    addNewService(ROOM);
//                    break;
//                case 4:
//                    displayMenu();
//                    break;
//                case 5:
//                    System.exit(0);
//                default:
//                    System.out.println("Fail !! You must choice again..");
//                    sc.nextLine();
//                    addNewServices();
//            }
//        } while (true);
//    }
//
//    private static void addNewService(String fileName) {
//        String id = null;
//        do {
//            System.out.print("Please enter service id : ");
//            id = sc.nextLine();
//        } while (!Validator.isValidRegex(id, Validator.SERVICE_CODE_REGEX));
//
//        String serviceName = null;
//        do {
//            System.out.print("Please enter service name : ");
//            serviceName = sc.nextLine();
//        } while (!Validator.isValidRegex(serviceName, Validator.SERVICE_NAME_REGEX));
//
//        double usedArea = 0;
//        do {
//            System.out.print("Please enter area use : ");
//            usedArea = Double.parseDouble(sc.nextLine());
//        } while (!Validator.isMoreThan(usedArea, 30));
//
//        double rentPrice = 0;
//        do {
//            System.out.print("Please enter rent price : ");
//            rentPrice = Double.parseDouble(sc.nextLine());
//        } while (!Validator.isMoreThan(rentPrice, 0));
//
//        int numberPeople = 0;
//        do {
//            System.out.print("Please enter number of people : ");
//            numberPeople = Integer.parseInt(sc.nextLine());
//        } while (!Validator.isMoreThan(numberPeople, 0, 20));
//
//        String rentType = null;
//        do {
//            System.out.print("Please enter type rent : ");
//            rentType = sc.nextLine();
//        } while (!Validator.isValidRegex(rentType, Validator.SERVICE_NAME_REGEX));
//
//
//        FuncFileCSV.setFullPathFile(fileName);
//
//        if (fileName.equals(VILLA)) {
//            String standardRoom = null;
//            do {
//                System.out.print("Please enter standard room : ");
//                standardRoom = sc.nextLine();
//            } while (!Validator.isValidRegex(standardRoom, Validator.SERVICE_NAME_REGEX));
//
//            System.out.print("Please enter other description : ");
//            String otherDescription = sc.nextLine();
//
//            double poolArea = 0;
//            do {
//                System.out.print("Please enter pool area : ");
//                poolArea = Double.parseDouble(sc.nextLine());
//            } while (!Validator.isMoreThan(poolArea, 30));
//
//            int floor = 0;
//            do {
//                System.out.print("Please enter number floor : ");
//                floor = Integer.parseInt(sc.nextLine());
//            } while (!Validator.isMoreThan(floor, 0));
//
//            FuncFileCSV.writeFile(new String[]{id, serviceName, String.valueOf(usedArea), String.valueOf(rentPrice),
//                    String.valueOf(numberPeople), rentType, standardRoom, otherDescription, String.valueOf(poolArea), String.valueOf(floor)});
//
//        } else if (fileName.equals(HOUSE)) {
//            System.out.print("Please enter standard room : ");
//            String standardRoom = sc.nextLine();
//
//            System.out.print("Please enter other description : ");
//            String otherDescription = sc.nextLine();
//
//            int floor = 0;
//            do {
//                System.out.print("Please enter number floor : ");
//                floor = Integer.parseInt(sc.nextLine());
//            } while (!Validator.isMoreThan(floor, 0));
//
//            FuncFileCSV.writeFile(new String[]{id, serviceName, String.valueOf(usedArea), String.valueOf(rentPrice),
//                    String.valueOf(numberPeople), rentType, standardRoom, otherDescription, String.valueOf(floor)});
//
//        } else if (fileName.equals(ROOM)) {
//            String freeService = null;
//            do {
//                System.out.print("Please enter free Service : ");
//                freeService = sc.nextLine();
//            } while (!Validator.isValidExtraServiceName(freeService));
//
//            System.out.print("Please enter unit : ");
//            int unit = Integer.parseInt(sc.nextLine());
//            System.out.print("Please enter money : ");
//            double money = Double.parseDouble(sc.nextLine());
//
//            FuncFileCSV.writeFile(new String[]{id, serviceName, String.valueOf(usedArea), String.valueOf(rentPrice),
//                    String.valueOf(numberPeople), rentType, freeService, String.valueOf(unit), String.valueOf(money)});
//        }
//    }
}
