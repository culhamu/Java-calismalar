package Konu2;

public class Quiz_08 {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin
        int baslangic=11;
        int bitis=345;
        int sayac=0;
        int toplam=0;
        for (int i = baslangic; i <=bitis ; i+=7) {
            System.out.print(i+ " ");
            sayac++;
            toplam+=i;


        }
        System.out.println("");
        System.out.println(sayac+toplam);
    }
}
