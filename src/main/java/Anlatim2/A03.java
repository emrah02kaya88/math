package Anlatim2;

import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {

        int toplam = 0;
        for (int i = 5; i <= 12; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);

        int sum = 0;
        for (int i = 18; i >= 3; i--) {
            sum +=i;
        }
        System.out.println("2.toplam= "+sum);

        System.out.println("==================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("keliime giriniz");
        String s = scan.nextLine();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));

        }
    }
}
