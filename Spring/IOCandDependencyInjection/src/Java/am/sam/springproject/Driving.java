package am.sam.springproject;

public class Driving {

    private Car car;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Driving(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    void toDrive() {
        System.out.println("to drive a " + car.getName()+ " " + car.getSeries());
    }
}
