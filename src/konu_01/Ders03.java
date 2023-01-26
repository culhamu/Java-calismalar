package konu_01;

import java.util.Scanner;

public class Ders03 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        //bunlarin toplamini ve carpimini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen bir double sayı giriniz");
        double sayi2= scan.nextDouble();

        double sayiToplam=sayi2+sayi1;
        double sayiCarpim=sayi2*sayi1;

        System.out.println("Sayıların toplamı:"+sayiToplam+"\n" +
                "Sayıların çarpımı:"+sayiCarpim);

    }
}
