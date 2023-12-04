package Anlatim2;

import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        char ilk = scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Soyadinizi giriniz");
        String soyad = scan.nextLine().toUpperCase();
        char son = soyad.charAt(soyad.length() - 1);

        if (ilk <= son) {
            while (ilk <= son) {
                System.out.print(ilk + " ");
                ilk++;
            }
        } else {
            while (ilk >= son) {
                System.out.print(son + " ");
                son++;

            }


        }
    }
}
