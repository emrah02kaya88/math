package Anlatim;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class A20 {
    public static void main(String[] args) {
        /*
        Soru 1) String methodlarini kullanarak •• Java ogrenmek123 Cok guzel@ " String'ini ··Java
        ogrenmek cok guzel." sekline getirin.*/
        String s = "Java ogrenmek123 Cok guzel@";
        s = s.replace("@", ".").replaceAll("\\d", "").toLowerCase();
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(s);//Java ogrenmek cok guzel.
        //System.out.println(s.split(" ")[0] + s.split(" ")[1] + s.split(" ")[2] + s.split(" ")[3]);//Javaogrenmekcokguzel.

        //Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //        String str1 = ··$13.99" String str2 = .. $10.55"
        //        ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
        String str1 = "$13.99";
        String str2 = "$10.55";
        // System.out.println(Double.parseDouble(str1.substring(1)) + Double.parseDouble(str2.substring(1)));
        str1 = str1.replace("$", "");
        str2 = str2.replace("$", "");
        System.out.println(Double.valueOf(str1) + Double.valueOf(str2));

        /*Soru 3) Kullanicidan isim isteyin.
        Eger    -	isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
                -	isim "Z" harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
                -	ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor"  yazdirin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim giriniz");
        String ad = scan.nextLine();

        if (ad.contains("a") && ad.contains("Z")) {
            System.out.println("Girdiginiz isim a ve Z harfi iceriyor");
        } else if (ad.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        } else if (ad.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
        //Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        System.out.println("Lütfen isim giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisim giriniz");
        String soyisim = scan.nextLine();
        System.out.println(isim.length() > soyisim.length() ? "İSİM DAHA UZUN" : "SOYİSİM DAHA UZUN");
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        System.out.println("Lütfen 4 harfli kelime giriniz");
        String kelime = scan.nextLine();
        System.out.println(kelime.charAt(3) + "" + kelime.charAt(2) + "" + kelime.charAt(1) + "" + kelime.charAt(0));
        /*6. Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
                // tum karakterleri dynamic olarak aliniz //abc@gmail.com ===> gmail
         */
        System.out.println("Lütfen email giriniz");
        String mail = scan.nextLine();
        //System.out.println(mail.split("@")[1].split("\\.")[0]);
        // String t1 = mail.substring(mail.indexOf("@") + 1);
        String t2 = mail.substring(mail.indexOf("@") + 1, mail.indexOf("."));
        System.out.println(t2);

        // Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        //isim-soyisim : M***** B******* EMRAH KAYA
        // kart no : **** **** **** 1234

        System.out.println("Lütfen Adınızı giriniz");
        String adi = scan.nextLine();
        System.out.println("Lütfen Soyadınızı giriniz");
        String soyadi = scan.nextLine();
        System.out.println("Lütfen kredi karti no giriniz");
        String kartNo = scan.nextLine();

        adi = adi.substring(0, 1).toUpperCase() + adi.substring(1).replaceAll("\\w", "*");
        soyadi = soyadi.substring(0, 1).toUpperCase() + soyadi.substring(1).replaceAll("\\w", "*");
        kartNo = kartNo.substring(0, kartNo.length() - 3).replaceAll("\\d", "*") + kartNo.substring(kartNo.length() - 4);


        System.out.println("İSİM-SOYİSİM:  " + adi + " " + soyadi);
        System.out.println("kart no:  " + kartNo);

        /*
        Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa ''Sifre
        basari ile tanimlandi", sartlari saglamazsa "lslem basarisiz,Lutfen yeni bir
        sifre girin" yazdirin
        - ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        System.out.println("şifre giriniz");
        String psw = scan.nextLine();

        //- Sifre uzunlugu en az 8 karakter olmali
        boolean boy = psw.length() > 7;
        //- Sifre bosluk icermemeli
        boolean space = (psw.contains(" "));
        //  - ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        boolean buyuk = psw.charAt(0) >= 'A' && psw.charAt(0) <= 'Z';
        boolean kucuk = psw.charAt(psw.length()-1) >= 'a' && psw.charAt(psw.length()-1) <= 'z';

        if (boy && !space && buyuk && kucuk){
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }



    }
}
