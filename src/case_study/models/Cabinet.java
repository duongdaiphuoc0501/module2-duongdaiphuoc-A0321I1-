package case_study.models;

import case_study.controllers.FuramaController;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Cabinet {
    private static Stack<Person> stackEmployee = new Stack<>();

    static {
        Map<String, Person> mapOfEmployee = FuramaController.readAllEmployee(FuramaController.EMPLOYEE);
        for (Map.Entry<String, Person> employeeEntry : mapOfEmployee.entrySet()) {
            stackEmployee.push(employeeEntry.getValue());

        }
    }

    public static Person getFileOfEmployee(String id) {
        Person employee = null;
        while (!stackEmployee.isEmpty()) {
            employee = stackEmployee.pop();
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return employee;
    }

    public static void findFileOfEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter employee id to get file : ");
        String id = sc.nextLine();
        Person employee = getFileOfEmployee(id);
        if (employee != null) {
            System.out.println("File employee : " + employee.toString());
        } else {
            System.out.println("File employee is not found!");
        }
    }
}
