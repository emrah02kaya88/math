package Anlatim;

import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {
        /*
        1)Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz.
        2) Kulanici ad ve soyadini yazarken hatayla bas ve sona space koyarsa siliniz

        3) Ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali
        4) Kimlik numarasinin son 4 rakami haric hepsi * yapilmali
        Ornek: Ali Can *******1234
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adınızı giriniz");
        String ad = scan.nextLine();
        System.out.println("Lütfen Soyadınızı giriniz");
        String soyad = scan.nextLine();
        System.out.println("Lütfen Tc NO giriniz");
        String tc = scan.nextLine();

        ad = ad.trim();
        soyad = soyad.trim();

        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
        tc = tc.substring(0, tc.length() - 4).replaceAll("\\d", "*") + tc.substring(tc.length() - 4);

        System.out.println(ad + " " + soyad + " " + tc);
    }
}
