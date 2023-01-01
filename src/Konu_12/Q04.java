package Konu_12;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bölmek istediğiniz sayıyı giriniz");
        int bolunen=scan.nextInt();
        System.out.println("Lütfen bölen sayıyı giriniz");
        int bolen=scan.nextInt();
        System.out.println(bolum(bolunen,bolen));


    }public static int bolum(int bulunen,int bolen){
        int bolum=0;
     while (bulunen>=bolen){
         bulunen-=bolen;
         bolum++;

     }return bolum;
    }
}
