package Anlatim;

import java.util.Scanner;

public class A04a {
    public static void main(String[] args) {
        //"Cuma" ise ekrana "Müslümanlar icin kutsal gün" yazdırın.
        // "Cumartesi" ise ekrana "Yahudiler icin kutsal gün" yazdırın.
        // "Pazar" ise ekrana "Hıristiyanlar icin kutsal gün" yazdırın *

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gün girer misin?");
        String gun = scan.next().toLowerCase();

        switch (gun) {
            case "cuma":
                System.out.println("Müslümanlar icin kutsal gün");
                break;
            case "cumartesi":
                System.out.println("Yahudiler icin kutsal gün");
                break;
            case "pazar":
                System.out.println("Hıristiyanlar icin kutsal gün");
                break;
            default:
                System.out.println("Öyle bi kutsal gün yok!");
        }



        /*if (m) {
            System.out.println("Müslümanlar icin kutsal gün");
        }
        if (y) {
            System.out.println("Yahudiler icin kutsal gün");
        }
        if (h) {
            System.out.println("Hıristiyanlar icin kutsal gün");
        }
        if (!m && !y && !h) {
            System.out.println("öyle bir kutsal gün yok");
        }*/


    }
}
