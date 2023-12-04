package Anlatim;

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        //"Cuma" ise ekrana "Müslümanlar icin kutsal gün" yazdırın.
        // "Cumartesi" ise ekrana "Yahudiler icin kutsal gün" yazdırın.
        // "Pazar" ise ekrana "Hıristiyanlar icin kutsal gün" yazdırın *

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gün girer misin?");
        String gun = scan.next();

        Boolean m = gun.equalsIgnoreCase("Cuma");
        Boolean y = gun.equalsIgnoreCase("Cumartesi");
        Boolean h = gun.equalsIgnoreCase("Pazar");

        if (m) {
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
        }


    }
}
