package Konu_15;

import java.util.Arrays;

public class loops2 {
    public static void main(String[] args) {
        /*
        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        işaretiyle yazdırmak için gereken kodu yazınız.
        Örneğin; 75.4238 ´ *4*2*3*8
         */
        double sayi=75.4238;
        String s=String.valueOf(sayi);
        int nktIndx=s.indexOf('.');
        String ondalikliKisim=s.substring(nktIndx+1);
        String yeniSayi="";

        for (int i = 0; i <ondalikliKisim.length() ; i++) {
            String yeni=ondalikliKisim.substring(i,i+1);

            yeniSayi=yeniSayi+"*"+yeni;
        }
        System.out.println(yeniSayi);

    }
}
