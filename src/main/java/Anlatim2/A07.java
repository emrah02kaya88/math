package Anlatim2;

import java.util.Scanner;

public class A07 {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Rakam değerini giriniz");
        int s = scan.nextInt();

        if (s < 0 || s > 9) {
            System.out.println("Lütfen 0 dan 9 a kadar bir rakam giriniz!");
        } else {
            for (int i = 1; i <= 10; i++) {
                //  for (int j = 1; j <= 10; j++) {  }
                System.out.println(s + " x " + i + " = " + s * i);

            }
        }

        System.out.println();

        int carpim = 1;
        for (int i = 1; i <= s; i++) {
            carpim *=i;
        }
        System.out.println(carpim);


    }
}
