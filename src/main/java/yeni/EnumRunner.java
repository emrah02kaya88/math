package yeni;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        BeslenmeEgzersiz[] arr = BeslenmeEgzersiz.values();
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].getAyinMeyvesi());

        System.out.println(BeslenmeEgzersiz.Agustos.getAyinMeyvesi());
        //20 saat ustu egzersiz yapılacak ayları ekrana yazdırınız.
        for (BeslenmeEgzersiz each : arr) {
            if (each.getEgzersizSaati() > 20) {
                System.out.print(each + " ");
            }
        }

        System.out.println("=====================0");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir meyve ismi giriniz");
        String meyve = scan.next();


        for (BeslenmeEgzersiz w : arr) {
            if (meyve.equalsIgnoreCase(w.getAyinMeyvesi())){
                System.out.println(w +" ayında yapilacak olan egzersiz saati : "+ w.getEgzersizSaati());
            break;
            }
        }


    }
}
