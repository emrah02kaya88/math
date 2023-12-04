package Anlatim;

import java.util.Scanner;

public class A21 {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun
        vi)En az 1 tane sembol icermeli */

        String pwd = "iremkayA67%";

        boolean kar = pwd.length() > 7;
        //boolean space = pwd.replaceAll("\\S","").equals(pwd);
        boolean space = pwd.replaceAll("[^ ]", "").length() == 0;
        //boolean space = pwd.replaceAll("[^ ]", "").isEmpty();
        boolean buyuk = pwd.replaceAll("[^A-Z]", "").length() > 0;
        boolean kucuk = pwd.replaceAll("[^a-z]", "").length() > 0;
        //boolean rakam = pwd.replaceAll("\\D", "").length() > 0;
        boolean rakam = pwd.replaceAll("[^0-9]", "").length() > 0;
        // boolean sembol = pwd.replaceAll("\\p{Punct}", "").length() > 0;
        boolean sembol = pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0;

        if (space && buyuk && kucuk && rakam && sembol && kar) {
            System.out.println("Sifre gecerlidir");
        } else {
            System.out.println("Sifre gecersizdir");
        }

    }
}
