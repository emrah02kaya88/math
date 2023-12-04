package Anlatim;

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {
        //Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer,
        //Uç kenar uzunluğu birbirine eşit ise ekrana "Eşkenar Uçgen" yazdırın.
        // Sadece iki kenar uzunluğu birbirine eşit ise
        //ekrana "Ikizkenar Uçgen" yazdırın. Tüm kenar uzunlukları birbirinden farklı ise "Çeşitkenar Uçgen" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("1.kenar uzunluğunu girer misin?");
        double k1 = scan.nextDouble();
        System.out.println("2.kenar uzunluğunu girer misin?");
        double k2 = scan.nextDouble();
        System.out.println("3.kenar uzunluğunu girer misin?");
        double k3 = scan.nextDouble();


        if (k1 == k2 && k2 == k3) {
            System.out.println("Eşkenar Uçgen");
        } else if (k1 == k2 || k2 == k3 || k1 == k3) {
            System.out.println("Ikizkenar Uçgen");
        } else {
            System.out.println("Çeşitkenar Uçgen");
        }


    }
}
