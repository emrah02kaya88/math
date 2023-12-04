package yeni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Urun {
    int id;
    String urunIsmi;
    String uretici;
    int miktar;
    String birim;
    String raf;

    // Urun sınıfının constructor'ı
    public Urun(int id, String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }
}

class Depo {
    List<Urun> urunListesi = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Urun tanımlama metodu
    public void urunTanimlama() {
        System.out.print("Urun ismi: ");
        String urunIsmi = scanner.next();
        System.out.print("Uretici: ");
        String uretici = scanner.next();
        System.out.print("Birim: ");
        String birim = scanner.next();

        int id = urunListesi.size() + 1000; // Basit bir id ataması, daha gelişmiş bir yöntem kullanılabilir.

        Urun yeniUrun = new Urun(id, urunIsmi, uretici, 0, birim, null);
        urunListesi.add(yeniUrun);

        System.out.println("Urun tanimlandi. ID: " + id);
    }

    // Urun listeleme metodu
    public void urunListele() {
        System.out.println("ID\tISIM\tURETICI\tMIKTAR\tBIRIM\tRAF");
        System.out.println("---------------------------------------");
        for (Urun urun : urunListesi) {
            System.out.println(urun.id + "\t" + urun.urunIsmi + "\t" + urun.uretici + "\t" +
                    urun.miktar + "\t" + urun.birim + "\t" + (urun.raf != null ? urun.raf : "null"));
        }
    }

    // Urun girisi metodu
    public void urunGirisi() {
        System.out.print("Urun ID: ");
        int urunId = scanner.nextInt();
        System.out.print("Giris miktarı: ");
        int girisMiktari = scanner.nextInt();

        for (Urun urun : urunListesi) {
            if (urun.id == urunId) {
                urun.miktar += girisMiktari;
                System.out.println("Urun girisi yapıldı. Yeni miktar: " + urun.miktar);
                break;
            }
        }
    }

    // Urunu rafa koy metodu
    public void urunuRafaKoy() {
        System.out.print("Urun ID: ");
        int urunId = scanner.nextInt();
        System.out.print("Raf: ");
        String raf = scanner.next();

        for (Urun urun : urunListesi) {
            if (urun.id == urunId) {
                urun.raf = raf;
                System.out.println("Urun rafa konuldu. Raf: " + raf);
                break;
            }
        }
    }

    // Urun cikisi metodu
    public void urunCikisi() {
        System.out.print("Urun ID: ");
        int urunId = scanner.nextInt();
        System.out.print("Cikis miktarı: ");
        int cikisMiktari = scanner.nextInt();

        for (Urun urun : urunListesi) {
            if (urun.id == urunId) {
                if (urun.miktar >= cikisMiktari) {
                    urun.miktar -= cikisMiktari;
                    System.out.println("Urun cikisi yapıldı. Yeni miktar: " + urun.miktar);
                } else {
                    System.out.println("Hata: Cikis miktarı stok miktarından fazla!");
                }
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Depo depo = new Depo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1- Urun Tanımlama");
            System.out.println("2- Urun Listeleme");
            System.out.println("3- Urun Girisi");
            System.out.println("4- Urunu Rafa Koy");
            System.out.println("5- Urun Cikisi");
            System.out.println("0- Cikis");
            System.out.print("Secim yapin: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    depo.urunTanimlama();
                    break;
                case 2:
                    depo.urunListele();
                    break;
                case 3:
                    depo.urunGirisi();
                    break;
                case 4:
                    depo.urunuRafaKoy();
                    break;
                case 5:
                    depo.urunCikisi();
                    break;
                case 0:
                    System.out.println("Programdan cikiliyor...");
                    System.exit(0);
                default:
                    System.out.println("Hatali secim! Tekrar deneyin.");
            }
        }
    }
}



