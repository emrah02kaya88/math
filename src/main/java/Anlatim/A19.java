package Anlatim;

import java.util.Scanner;

public class A19 {
    public static void main(String[] args) {
     /* Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.
        Ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
        Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.
        Ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen password giriniz");
        String s = scan.nextLine();

        char ilk = s.charAt(0);

        if (ilk >= 'A' && ilk <= 'Z') {
            if (ilk == 'A') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        } else if (ilk >= 'a' && ilk <= 'z') {
            if (ilk == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        }
    }
}
