package model;

public class Scooter {

    private String brand;
    private int wheels;

    public Scooter(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
