package Anlatim2;

import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç harf değerini giriniz");
        char bas = scan.next().toUpperCase().charAt(0);
        System.out.println("Bitiş harf değerini giriniz");
        char son = scan.next().toUpperCase().charAt(0);

        if (!(bas >= 'A' && bas <= 'Z' && son >= 'A' && son <= 'Z')) {
            System.out.println("harf giriniz");
        } else {
            if (bas <= son) {
                for (char i = bas; i <= son; i++) {
                    System.out.print(i + " ");
                }
            } else {
                for (char i = bas; i >= son; i--) {
                    System.out.print(i + " ");
                }
            }
        }


    }
}
