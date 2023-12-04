package Anlatim2;

import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Satır değerini giriniz");
        int s = scan.nextInt();


        for (int i = 1; i <= s; i++) {
            for (int j = s - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= s - 1; i++) {
            for (int j = 0; j <= i - 1; j++) {// 0 1 2
                System.out.print(" ");
            }
            for (int j = s - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("==============");
        System.out.println();

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = s - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("!!==============");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*s-i; j >0 ; j=j-2) {
                System.out.print("*");
                j=j-2;
            }
            System.out.println(" ");
        }

    }
}
