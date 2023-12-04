package Anlatim2;

import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {

        /*Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarakgirilen sayiya kadar tum sayilari yazdirin. Ancak;
        -	Sayi 3'un kati ise sayi yerine "Java" yazdirin.
        -	Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
        -	Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("100 den küçük sayı giriniz");
        int s = scan.nextInt();

        if (s < 0 || s > 99) {
            System.out.println("Sayı 100 den küçük değil!");
        } else {
            for (int i = 1; i <= s; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Java Güzeldir");
                } else if (i % 3 == 0) {
                    System.out.println("Java");
                } else if (i % 5 == 0) {
                    System.out.println("Güzeldir");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
/*
for (int i = 1; i <= s; i++) {
                if (s % 3 == 0 && s % 5 == 0) {


 */