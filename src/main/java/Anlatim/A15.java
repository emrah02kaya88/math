package Anlatim;

import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        /*
         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.
         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz
        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0-4 arasi sinav puanını sisteme giriniz?");
        double puan = scan.nextDouble();
        String seviye = "";
        if (puan <= 0 || puan > 4) {
            System.out.println("Atanmadi, 0-4 arasi puan giriniz");
        } else if (puan >= 0 && puan < 1) {
            seviye = "KALDI";
        } else if (puan < 2) {
            seviye = "GECTİ";
        } else if (puan < 2.5) {
            seviye = "IYI";
        } else if (puan < 3.5) {
            seviye = "UST";
        } else {
            seviye = "HARİKA";
        }
        System.out.println(seviye);
        System.out.print("SINAV notunuz: ");

        switch (seviye) {
            case "KALDI":
                System.out.println("F");
                break;
            case "GECTİ":
                System.out.println("D");
                break;

            case "IYI":
                System.out.println("C");
                break;

            case "UST":
                System.out.println("B");
                break;

            case "HARİKA":
                System.out.println("A");
                break;
        }


    }
}
