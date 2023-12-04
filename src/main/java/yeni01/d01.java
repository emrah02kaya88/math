package yeni01;

import java.util.Scanner;

public class d01 {
    public static void main(String[] args) {
        /* a =12 b=25 olsun
        öyle bir kod yaz ki a 25, b 12 olsun.
        sayıları kullanıcıdan al

         */
        Scanner input = new Scanner(System.in);
        System.out.println("a sayısını girin");//12
        int a = input.nextInt();
        System.out.println("b sayısını girin");//25
        int b = input.nextInt();

        int temp = 0;

        temp = a;// temp 12 a12 b25
        a = b;//    temp 12 a25 b25
        b=temp;//   temp 12 a25 b12

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.yol a 12 b 25

        a=a+b;  //a37  b25
        b=a-b;  //a37 b12
        a=a-b;  //a25 b11

        System.out.println("a2 = " + a);
        System.out.println("b2 = " + b);


    }
}
