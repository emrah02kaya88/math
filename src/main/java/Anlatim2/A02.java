package Anlatim2;

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int s = scan.nextInt();

        if (s < 1) {
            System.out.println("Pozitif tamsayı giriniz");
        } else {
            for (int i = s; i > 0; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }

        }
    }
}