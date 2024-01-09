package lesson33;

public class SalesManager extends Employee{

    private double salesVolume;
    private double percent;


    public SalesManager(int id, String firstName, String lastName, double hour, double salesVolume, double percent) {
        super(id, firstName, lastName, hour);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    public double getSalesVolume() {

        return salesVolume;
    }

    public double getPercent() {

        return percent;
    }

    @Override
    public double calculateSalary() {
        double salary = getSalesVolume() * getPercent();
        if(salary < getHour()*StateConstants.MIN_WAGE){
            salary = getHour()*StateConstants.MIN_WAGE;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                "salesVolume=" + getSalesVolume() +
                ", percent=" + getPercent() +
                '}' + super.toString();
    }
}
