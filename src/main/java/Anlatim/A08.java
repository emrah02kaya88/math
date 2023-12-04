package Anlatim;

import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {

        /*Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
        Eğer urun miktarı 1000 den fazla ise kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın.
        Diğer durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazıdırın*/

        Scanner scan = new Scanner(System.in);
        System.out.println("ürün miktarı girer misin?");
        int miktar = scan.nextInt();
        System.out.println("ürün birim fiyatı girer misin?");
        double fiyat = scan.nextDouble();

        double result = (miktar > 1000 ? fiyat * 0.9 * miktar : fiyat * miktar);
        System.out.println("Toplam Tutar = " + result);

        //System.out.println(miktar > 1000 ? "İNDİRİMLİ FİYAT:  " + fiyat * 0.9 * miktar : "indirm yohh----> FİYAT " + fiyat * miktar);

        /*if (miktar > 1000) {
            System.out.println("İNDİRİMLİ FİYAT:  " + fiyat * 0.9 * miktar);

        } else {
            System.out.println("indirm yohh----> FİYAT " + fiyat * miktar);

        }*/


    }
}
