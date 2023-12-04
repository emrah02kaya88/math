package Anlatim;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        /*Girdiği küçük harf ise harfin "a" olup olmadığını kontrol edin. Harf "a" ise ekrana "Ilk küçük harf" yazdırın.
                "a" değil ise ekrana "Ilk küçük harf değil" yazdırın.
        Girdiği büyük harf ise harfin "Z" olup olmadığını kontrol edin. Harf "Z" ise ekrana "Son büyük harf" yazdırın.
                "Z" değil ise ekrana "Son büyük harf değil" yazdırın.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Harf girer misin?");
        char k = scan.next().charAt(0);
        if (k >= 'a' && k <= 'z') {
            if (k == 'a') {
                System.out.println("Ilk küçük harf");
            } else {
                System.out.println("Ilk küçük harf değil");
            }
        } else if (k >= 'A' && k <= 'Z') {
            if (k == 'Z') {
                System.out.println("Son büyük harf");
            } else {
                System.out.println("Sona büyük harf değil");
            }
        }else {
            System.out.println("Lütfen harf giriniz");
        }


    }
}