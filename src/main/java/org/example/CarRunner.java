package org.example;

public class CarRunner {
    public static void main(String[] args) {

        Car c1= new Car("Opel","Astra",2012,false);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.hybrid);
        System.out.println(c1.year);

        c1.hareket();
        c1.dur();



        Car c2= new Car("VOLKSWAGEN","Tiguan",2018,false);
        System.out.println(c1);
        System.out.println(c2);


    }
}
