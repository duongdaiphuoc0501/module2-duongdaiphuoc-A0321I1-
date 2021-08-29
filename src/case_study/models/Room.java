package case_study.models;

public class Room extends Facility {
    protected ExtraService extraService;


    public Room() {
    }

    public Room(ExtraService extraService) {
        this.extraService = extraService;
    }

    public Room(String id, String serviceName, double usedArea, double rentPrice, int numberPeople, String rentType, ExtraService extraService) {
        super(id, serviceName, usedArea, rentPrice, numberPeople, rentType);
        this.extraService = extraService;
    }

    public ExtraService getExtraService() {
        return extraService;
    }

    public void setExtraService(ExtraService extraService) {
        this.extraService = extraService;
    }

    @Override
    public void showInfo() {
        System.out.println("Room information........" + " ID : " + getId() + " | Service Name : " + getServiceName() +
                " | Used Area : " + getUsedArea() + " | Rent Price : " + getRentPrice() + " | Number of people : " + getNumberPeople() +
                " | Rent Type : " + getRentType() + " | Free Service : " + getExtraService());
    }

    @Override
    public String toString() {
        return "Room information........" + " ID : " + getId() + " | Service Name : " + getServiceName() +
                " | Used Area : " + getUsedArea() + " | Rent Price : " + getRentPrice() + " | Number of people : " + getNumberPeople() +
                " | Rent Type : " + getRentType() + " | Free Service : " + getExtraService();
    }
}

