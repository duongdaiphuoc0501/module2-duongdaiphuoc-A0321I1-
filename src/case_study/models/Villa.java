package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private String utilityDescription;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String roomStandard, String utilityDescription, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.utilityDescription = utilityDescription;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String id, String serviceName, double usedArea, double rentPrice, int numberPeople, String rentType, String roomStandard, String utilityDescription, double poolArea, int floor) {
        super(id, serviceName, usedArea, rentPrice, numberPeople, rentType);
        this.roomStandard = roomStandard;
        this.utilityDescription = utilityDescription;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getUtilityDescription() {
        return utilityDescription;
    }

    public void setUtilityDescription(String utilityDescription) {
        this.utilityDescription = utilityDescription;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfo() {
        System.out.println("Villa information........" + " ID : " + getId() + " | Service Name : " + getServiceName() +
                " | Used Area : " + getUsedArea() + " | Rent Price : " + getRentPrice() + " | Number of people : " + getNumberPeople() +
                " | Rent Type : " + getRentType() + " | Room Standard : " + getRoomStandard() + " | Utility Description: " + getUtilityDescription() +
                " | Pool Area : " + getPoolArea() + " | Floor : " + getFloor());
    }

    @Override
    public String toString() {
        return "Villa information.." + " ID : " + getId() + " | Service Name : " + getServiceName() +
                " | Used Area : " + getUsedArea() + " | Rent Price : " + getRentPrice() + " | Number of people : " + getNumberPeople() +
                " | Rent Type : " + getRentType() + " | Room Standard : " + getRoomStandard() + " | Utility Description: " + getUtilityDescription() +
                " | Pool Area : " + getPoolArea() + " | Floor : " + getFloor();
    }

}
