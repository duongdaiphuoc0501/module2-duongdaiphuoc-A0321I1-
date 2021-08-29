package case_study.models;

public class House extends Facility {
    protected String standardRoom;
    protected String utilityDescription;
    protected int floor;

    public House() {
    }

    public House(String standardRoom, String utilityDescription, int floor) {
        this.standardRoom = standardRoom;
        this.utilityDescription = utilityDescription;
        this.floor = floor;
    }

    public House(String id, String serviceName, double usedArea, double rentPrice, int numberPeople, String rentType, String standardRoom, String utilityDescription, int floor) {
        super(id, serviceName, usedArea, rentPrice, numberPeople, rentType);
        this.standardRoom = standardRoom;
        this.utilityDescription = utilityDescription;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getUtilityDescription() {
        return utilityDescription;
    }

    public void setUtilityDescription(String utilityDescription) {
        this.utilityDescription = utilityDescription;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfo() {
        System.out.println("House information........" + " ID : " + getId() + " | Service Name : " + getServiceName() +
                " | Used Area : " + getUsedArea() + " | Rent Price : " + getRentPrice() + " | Number of people : " + getNumberPeople() +
                " | Rent Type : " + getRentType() + " | Room Standard : " + getStandardRoom() + " | Utility Description: " + getUtilityDescription() +
                " | Floor : " + getFloor());
    }

    @Override
    public String toString() {
        return "House information........" + " ID : " + getId() + " | Service Name : " + getServiceName() +
                " | Used Area : " + getUsedArea() + " | Rent Price : " + getRentPrice() + " | Number of people : " + getNumberPeople() +
                " | Rent Type : " + getRentType() + " | Room Standard : " + getStandardRoom() + " | Utility Description: " + getUtilityDescription() +
                " | Floor : " + getFloor();
    }
}