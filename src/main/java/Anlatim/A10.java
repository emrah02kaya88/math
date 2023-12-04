package Anlatim;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        /*Kullanıcıdan cinsiyetini girmesini isteyin.
        Erkek ise yaşını kontrol edin.
        Yaşı 18 den küçük ise ekrana "Erkek çocuk" yazdırın. Yaşı 18 den büyük eşit ise ekrana "Adam" yazdırın.
        Kadin ise yasini kontrol edin.
        Yaşı 18 den küçük ise ekrana "Kız çocuk" yazdırın. Yaşı 18 den büyük eşit ise ekrana "Kadın" yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi söyler misin?");
        String cins = scan.next();
        System.out.println("Yaşınız nedir?");
        int yas = scan.nextInt();


        if (cins.equalsIgnoreCase("erkek")) {
            if (yas < 18) {
                System.out.println("Erkek çocuk");
            } else
                System.out.println("Adam");
        } else if (cins.equalsIgnoreCase("kadin")) {
            if (yas < 18) {
                System.out.println("Kız çocuk");
            } else
                System.out.println("Kadin");
        } else {
            System.out.println("Hatalı giriş");
        }



    }
}
