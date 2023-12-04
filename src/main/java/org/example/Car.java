package org.example;

public class Car {
    String brand = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public void hareket() {
        System.out.println(brand + " hızlı hareket eder");
    }

    public void dur() {
        System.out.println(brand + " güvenli bir şekilde durur");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

    public Car(String brand, String model, int year, boolean hybrid) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hybrid=hybrid;



    }

}
