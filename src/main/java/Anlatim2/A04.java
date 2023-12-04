package Anlatim2;

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitiş değerini giriniz");
        int bit = scan.nextInt();
        int toplam = 0;
        int carpim = 1;

        if (bas <= bit) {
            for (int i = bas; i <= bit; i++) {
                toplam = toplam + i;
            }
            for (int i = bas; i <= bit; i++) {
                carpim = carpim * i;
            }
        } else {
            for (int i = bas; i >= bit; i--) {
                toplam = toplam + i;
            }
            for (int i = bas; i >= bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.println("toplam = " + toplam);
        System.out.println("carpim = " + carpim);
    }
}
