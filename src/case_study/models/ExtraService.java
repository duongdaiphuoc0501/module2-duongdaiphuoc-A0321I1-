package case_study.models;

public class ExtraService extends Room{
    private String serviceName;
    private int unit;
    private double money;

    public ExtraService(String serviceName, String s, int money) {
    }

    public ExtraService(String serviceName, int unit, double money) {
        this.serviceName = serviceName;
        this.unit = unit;
        this.money = money;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ServiceExtra{" +
                "serviceName='" + serviceName + '\'' +
                ", unit=" + unit +
                ", money=" + money +
                '}';
    }
}
