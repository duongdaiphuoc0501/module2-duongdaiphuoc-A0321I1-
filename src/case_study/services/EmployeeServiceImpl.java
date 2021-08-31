package case_study.services;

import case_study.exceptions.IdCardException;
import case_study.models.Employee;
import case_study.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee :
                employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap chung minh: ");
        String idcard = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap chuc vu: ");
        String level = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String position = scanner.nextLine();
        System.out.println("Nhap luong: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, idcard, sex, email, level, position, salary);
        employeeList.add(employee);
        System.out.println("Them thanh cong");
    }

    @Override
    public void edit() {
        boolean check = true;
        int id;
        int index;
        do {
            System.out.print("Nhập id: ");
            id = scanner.nextInt();
            index = findId(id);
            if (index == -1) System.out.println("Không tìm thấy id này!");
        } while (index == -1);

        while (check) {
            System.out.println("==Edit employee==");
            System.out.println("1. Sủa tên");
            System.out.println("2. Sửa ngày sinh");
            System.out.println("3. Sủa giới tính");
            System.out.println("4. Sửa số cmnd");
            System.out.println("5. Sửa email");
            System.out.println("6. Sửa trình độ");
            System.out.println("7. Sủa vị trí");
            System.out.println("8. Sửa tiền lương");
            System.out.println("9. Quay lại");
            System.out.print("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập tên mới: ");
                    String ten = scanner.nextLine();
                    employeeList.get(index).setMame(ten);
                    break;
                case 2:
                    System.out.println("Nhập tuổi mới");
                    int tuoi = Integer.parseInt(scanner.nextLine());
                    employeeList.get(index).setAge(tuoi);
                    break;
                case 3:
                    System.out.print("Nhập giới tính: ");
                    String gt = scanner.nextLine();
                    employeeList.get(index).setSex(gt);
                    break;
                case 4:
                    String cmnd;
                    do {
                        System.out.print("Nhập cmnd mới: ");
                        cmnd = scanner.nextLine();
                    } while (cmnd.length() < 9);
                    employeeList.get(index).setIdcard(cmnd);
                    break;

                case 5:
                    String email;
                    System.out.print("Nhập email mới: ");
                    email = scanner.nextLine();
                    employeeList.get(index).setEmail(email);
                    break;
                case 6:
                    String trinhDo;
                    System.out.print("Nhập trình độ (trung cấp/cao đẳng/đại học): ");
                    trinhDo = scanner.nextLine();
                    employeeList.get(index).setLevel(trinhDo);
                    break;
                case 7:
                    String viTri;
                    System.out.print("Nhập vị trí (lễ tân/phục vụ/chuyên viên/giám sát/quản lý/giám đốc): ");
                    viTri = scanner.nextLine();
                    employeeList.get(index).setPosition(viTri);
                    break;
                case 8:
                    System.out.print("Nhập tiền lương mới: ");
                    int luong = Integer.parseInt(scanner.nextLine());
                    employeeList.get(index).setSalary(luong);
                    break;
                case 9:
                    check = false;
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void delete() {
        int id;
        int index;
        do {
            System.out.print("Nhập id muon xoa: ");
            id = scanner.nextInt();
            index = findId(id);
            if (index == -1){
                System.out.println("Không tìm thấy id này!");
            } else {
                employeeList.remove(index);
            }
        } while (index == -1);
    }

    public int findId(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
