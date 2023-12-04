package Anlatim;

import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {
        //Kullanıcıdan bir yıl alın
        //Eğer yıl 1000'e bulunuyorsa ekrana "Milenyum" yazdırın.
        // Eğer yıl 100'e bulunuyorsa ekrana "Yüzyıl" yazdırın.
        // Eğer yıl 10'a bulunuyorsa ekrana "Onyil" yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yıl girer misin?");
        int yil = scan.nextInt();

        if (yil % 1000 ==0){
            System.out.println("Milenyum");
        }else if (yil % 100 ==0){
            System.out.println("Yüzyıl");
        }else if (yil % 10 ==0){
            System.out.println("Onyil");
        }else {
            System.out.println("Normal bi yıl işte!");
        }
    }
}
