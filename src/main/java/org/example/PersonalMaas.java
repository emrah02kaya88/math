package org.example;

public class PersonalMaas {
    public static void main(String[] args) {
        Memur memur1 = new Memur();
        Isci isci1 = new Isci();

        double isci1Maas = isci1.netMaas(10000, 180, 9);

        System.out.println(isci1Maas);
        System.out.println("======================================");
        double memur1maas = memur1.netMaas(20000, 200, 12);
        System.out.println(memur1maas);

    }
}
