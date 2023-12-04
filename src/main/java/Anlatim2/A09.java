package Anlatim2;

import java.util.Scanner;

public class A09 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir String isteyin. Kullanicinin girdigi String'in
        palindrome olup olmadigini kontrol eden bir program yazin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("keliime giriniz");
        String s = scan.nextLine();
        String ters = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ters = ters + s.charAt(i);
        }
        System.out.println(ters);

        if (s.equals(ters)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom değil");
        }

    }
}
