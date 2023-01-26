package konu_03;

import java.util.Scanner;

public class Quiz_04 {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tane pozitif tamsayı giriniz");
        int sayiBaslangic= scan.nextInt();
        int sayiBitis= scan.nextInt();


        if (sayiBaslangic>sayiBitis){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");

        }else {
            int toplam=0;
            for (int i = sayiBaslangic; i <=sayiBitis; i++) {
                toplam+=i;



        }System.out.println("sayıların toplamı:"+ (toplam));

        }

    }
}
