package Anlatim2;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int s1 = scan.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(s1 + " x " + i+" = "+s1 * i);
            i++;
        }


    }
}

