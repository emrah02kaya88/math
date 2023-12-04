package Anlatim;

import java.util.Scanner;

public class A07 {
    public static void main(String[] args) {

        //Eger sayi pozitif ise; 10 dan buyuk olup olmadigini kontrol edin Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        //Eger 10 dan kucuk veya esit ise ise "Normalsin!" yazdirin
        //Eger sayi pozitif degil ise; -10 dan buyuk olup olmadigini kontrol edin Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        //Eger -10 dan kucuk veya esit ise "Cok Negatifsin!" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı girer misiniz?");
        double s = scan.nextDouble();


        if (s > 0) {
            if (s > 10) {
                System.out.println("Buyuksun!");
            } else {
                System.out.println("Normalsin!");
            }
        } else if (s==0) {
            System.out.println("Sıfırsın!");
        } else {
            if (s > -10) {
                System.out.println("Negatifsin!");
            }else {
                System.out.println("Cok Negatifsin!");
            }

        }


    }
}
