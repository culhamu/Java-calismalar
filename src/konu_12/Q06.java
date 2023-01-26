package konu_12;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin


        int toplam=0;
        int sayi=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Lütfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;



        }while (sayi!=0);
        System.out.println("sayıların toplamı: "+toplam);
    }
}
