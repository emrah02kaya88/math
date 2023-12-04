package org.example;

public class Memur implements Muhasebe {


    @Override
    public double ekMesai(int calismaSaati) {
        if (calismaSaati > 120) {
            System.out.println("Aylık ek mesai ücreti : " + (calismaSaati - 120) * 10);
            return (calismaSaati - 120) * 10;
        } else {
            return 0;
        }
    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {

        if (calismaYili >= 10) {
            System.out.println("vergi :" + brutMaas * 0.3);
            return brutMaas * 0.3;
        } else {
            System.out.println("vergi :" + brutMaas * 0.25);
            return brutMaas * 0.25;
        }
    }

    public double netMaas(double brutMaas, int calismaSaati, int calismaYili){
        return brutMaas+ekMesai(calismaSaati)-vergi(brutMaas, calismaYili);
    }



}
