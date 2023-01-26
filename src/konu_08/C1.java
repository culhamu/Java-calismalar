package konu_08;

public class C1 {
    public static void main(String[] args) {
        /*
          // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin
         */
        int input=23;
        int input2=78;
        int toplam=0;
        int sayac=0;
        for (int i = input; i <=input2 ; i++) {
            if (i%7==0){
                toplam+=i;
                sayac++;
                System.out.print(i+" ");
            }


        }System.out.println("");
        System.out.print("Sayıların toplamı: "+toplam+" sayı adedi: "+sayac);
    }
}
