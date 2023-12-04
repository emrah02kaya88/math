package Anlatim;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı alın
        //Eğer tamsayı 0 dan kucuk ise ekrana "Negatif" yazdırın.0 ise ekrana "Nötr" yazdırın.
        //0dan büyük ise ekrana "Pozitif" yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı girer misin?");
        double s = scan.nextDouble();

        if (s < 0){
            System.out.println("Negatif");
        }else if(s==0){
            System.out.println("Nötr");
        }else {
            System.out.println("Pozitif");
        }


    }
}
