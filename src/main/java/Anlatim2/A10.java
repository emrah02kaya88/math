package Anlatim2;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
toplayip, sonucu yazdiran bir program yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int s1 = scan.nextInt();
        System.out.println("2.sayıyı giriniz");
        int s2 = scan.nextInt();
        int toplam = 0;
        for (int i = s1; i <= s2; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);

        System.out.println("=======================");
        String s = "Java kolaydir";

        int i = s.length() - 1;
        while (i >= 0) {
            System.out.print(s.charAt(i));
            i--;
        }
    }
}
