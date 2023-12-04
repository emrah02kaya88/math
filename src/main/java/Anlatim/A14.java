package Anlatim;

import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {

    /*Kullanıcıdan ay numarasını sisteme girmesini isteyiniz.
       Eger girilen ay 2 numaralı ay ise kullanıcıdan yıl da isteyin.
       Bu bilgilere göre ayin kaç gün çektigini yazdırınız.
       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay ismi girer misiniz?");
        String ay = scan.next().toLowerCase();

        switch (ay) {
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralik":
                System.out.println(31);
                break;
            case "subat":
                System.out.println("Lütfen yıl giriniz");
                int yil = scan.nextInt();
                if (yil % 4 == 0) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
                break;
            case "nisan":
            case "haziran":
            case "eylul":
            case "kasim":
                System.out.println(30);
                break;
            default:
                System.out.println("Geçerli ay ismi giriniz ");
        }
    }
}
