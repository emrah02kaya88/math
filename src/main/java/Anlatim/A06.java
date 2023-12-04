package Anlatim;

import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {

        //Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
        //Eğer urun miktarı 1000'den fazla ise kullanıcıya %10 indirim yapın
        // ve  ödemesi gereken toplam parayı ekrana yazdırın.
        //Diğer durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("ürün miktarı girer misin?");
        int miktar =  scan.nextInt();
        System.out.println("ürün birim fiyatı girer misin?");
        double fiyat = scan.nextDouble();

        if (miktar > 1000) {
            System.out.println("İnrimli Fiyat: " + fiyat * 0.9*miktar);
        } else {
            System.out.println("Fiyat: " + fiyat*miktar);
        }


    }
}
