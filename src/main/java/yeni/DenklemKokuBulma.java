package yeni;

import java.util.Scanner;

public class DenklemKokuBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2.Derece denklemin katsayılarını girin: (ax²+bx+c)");

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        double delta;
        delta = b * b - 4 * a * c;
        System.out.println("Δ =" + delta);

        if (delta == 0) {
            double kok = (-b) / (2 * a);
            System.out.println("Tek kök= " + kok);
        } else if (delta < 0) {
            System.out.println("Reel kök yoktur");
        } else {
            double kok1 = (-b - Math.sqrt(delta)) / (2 * a);
            double kok2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Kökler : " + kok1 + " ve " + kok2);

        }

    }

}
