package Anlatim;

import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {

        /*Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        1. 50 den az - D 2. 50 (dahil) ile 60 arası - C
        3. 60 (dahil) ile 80 arası - B. 4. 80 (dahil) ile 100 (Dahil) - A
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir not girer misin?");
        int not = scan.nextInt();

        if (not < 50 && not>-1) {
            System.out.println("Notunuz : D");
        } else if (not < 60) {
            System.out.println("Notunuz : C");
        } else if (not < 80) {
            System.out.println("Notunuz : B");
        } else if (not < 101) {
            System.out.println("Notunuz : A");
        }else {
            System.out.println("Geçersiz Giriş");
        }


    }
}
