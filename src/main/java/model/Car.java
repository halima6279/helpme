package model;

public class Car {
    private String model;
    private int mileage;
    private int year;

    public Car(String model, int mileage, int year) {
        this.model = model;
        this.mileage = mileage;
        this.year = year;
    }

    public Car(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                '}';
    }
}
