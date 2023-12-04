package Anlatim2;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitiş değerini giriniz");
        int bit = scan.nextInt();

        if (bit<bas) {
            System.out.println("başlangıç, bitiş den küçük olmalı");
        } else {
            for (int i = bas; i <= bit; i++) {
                System.out.print(i + " ");
            }
        }


    }
}

