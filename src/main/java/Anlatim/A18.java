package Anlatim;

import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
      /*  1) Kullanicidan bir String alin
        2) Tum rakamlari * a cevirin
        3) Bas ve sondaki tum space'leri silin
        4) Aralardaki tum space'leri ! isaretine cevirin
        5) a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
        6) En bas'a "(" ve en sona")" ekleyin */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen password giriniz");
        String s = scan.nextLine();

        s = s.trim().replaceAll("\\d", "*").replaceAll("\\s", "!");
        //System.out.println(s);

        s = s.toLowerCase().replace('a', 'A').replace('z', 'Z');
        System.out.println(s);
        System.out.println("(" + s + ")");
        /*
        )Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5'e bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5'e bölünen çift sayı" yazdırın.
        Son rakamı 0 değil ise "5'e bölünen tek sayı" yazdırın.

        Girdiği password 5'e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.
         */

        System.out.println("===============");

        System.out.println("Lütfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi > 999 && sayi < 10000) {
            if (sayi % 5 == 0) {
                if (sayi % 2 == 0) {
                    System.out.println("5'e bölünen çift sayı");
                } else {
                    System.out.println("5'e bölünen tek sayı");
                }
            } else {
                System.out.println("5'e bölünmeyen sayı ");
            }
        } else {
            System.out.println("4 basamaklı bir sayı girmediğiniz için hesalanamadı");
        }


    }
}
