package case_study.services;

import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element:
                facilityIntegerMap.entrySet()) {
            System.out.println("Service: " + element.getKey() + "So lan da thue: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();
        System.out.println("Nhap ten dich vu: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        Double usedArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia tien: ");
        Double rentPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so luong nguoi: ");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String rentType = scanner.nextLine();
        System.out.println("Nhap tieu chuan: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhap dien tich ho boi: ");
        Double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so tang: ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(id, serviceName, usedArea, rentPrice, numberPeople, rentType, roomStandard, poolArea, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Them thanh cong");
    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
