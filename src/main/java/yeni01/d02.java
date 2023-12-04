package yeni01;

import java.util.Scanner;

public class d02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir karakter girin");

        char harf = input.next().charAt(4);

        if (harf >= 'A' && harf <= 'Z') {
            System.out.println("büyük harf");
        }else if (harf >= 'a' && harf <= 'z') {
            System.out.println("küçük harf");
        }
        if (!(harf >= 'A' && harf <= 'Z') && !(harf >= 'a' && harf <= 'z')) {
            System.out.println("harf değil");
        }

    }
}
