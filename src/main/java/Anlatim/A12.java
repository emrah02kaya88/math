package Anlatim;

import java.util.Scanner;

public class A12 {

    public static void main(String[] args) {

        /*numara girip gün ismi vermesini sağla 7 den büyükse  Geçerli gün giriniz deyin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir numara girer misiniz?");
        int gun = scan.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçerli gün giriniz ");
        }

        System.out.println("Bir gün ismi girer misiniz?");
        String day = scan.next();

        switch (day.toLowerCase()) {
            case "pazartesi":
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println(day + " hafta içi bir gündür");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println(day + " hafta sonu bir gündür");
                break;
        }


    }
}
