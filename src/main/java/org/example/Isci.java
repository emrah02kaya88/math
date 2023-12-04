package org.example;

public class Isci implements Muhasebe {
    @Override
    public double ekMesai(int calismaSaati) {
        if (calismaSaati > 160) {
            System.out.println("Aylık ek mesai ücreti : " + (calismaSaati - 160) * 10);
            return (calismaSaati - 160) * 10;
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
            System.out.println("vergi :" + brutMaas * 0.2);
            return brutMaas * 0.2;
        }
    }

    public double netMaas(double brutMaas, int calismaSaati, int calismaYili) {
        return brutMaas + ekMesai(calismaSaati) - vergi(brutMaas, calismaYili);
    }
}