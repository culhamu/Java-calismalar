package Konu_09;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin
        int sayi=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("Lütfen girmek için bir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

        }while (sayi!=0);
        System.out.println("Girilen sayilarin toplami : " + toplam);

    }
}
