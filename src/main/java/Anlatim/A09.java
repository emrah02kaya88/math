package Anlatim;

import java.util.Scanner;

public class A09 {
    public static void main(String[] args) {
       /* Kullanıcıdan password girmesini isteyin.
        Girdiği password 5'e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana "5'e bölünen çift sayı" yazdırın.
        Son rakamı 0 değil ise "5'e bölünen tek sayı" yazdırın.
        Girdiği password 5'e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Password girer misin?");
        int psw = scan.nextInt();


        System.out.println(psw % 5 == 0 ? (psw % 2 == 0 ? "5'e bölünen çift sayı" : "5'e bölünen tek sayı") : ("Tekrar deneyin"));

       /* if (psw % 5 == 0) {
            if (psw % 2 == 0) {
                System.out.println("5'e bölünen çift sayı");
            } else {
                System.out.println("5'e bölünen tek sayı");
            }
        } else {
            System.out.println("Tekrar deneyin");
        }*/


    }
}
