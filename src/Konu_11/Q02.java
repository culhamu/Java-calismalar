package Konu_11;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen baslangicdegerini giriniz :");
        int baslangic= scan.nextInt();
        System.out.println(" Lütfen  bitis giriniz :");
        int bitis=scan.nextInt();
        int toplam=0;
        String sonuc="uyarı";

        for (int i = baslangic; i <=bitis ; i++) {
            if (bitis>baslangic){
                toplam=toplam+i;
                sonuc=String.valueOf(toplam);


            }
        }
        System.out.println(sonuc);
    }
}
