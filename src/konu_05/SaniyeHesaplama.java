package konu_05;

import java.util.Scanner;

public class SaniyeHesaplama {
    public static void main(String[] args) {
        /*
        Soru 9-)  Girilen zamanı saniyeye çeviriniz.
         Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.
         Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.
         */
        int st,dk,sn;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sırasıyla saati dakikayı ve saniyeyi giriniz ");

        st=scan.nextInt();
        dk=scan.nextInt();
        sn=scan.nextInt();

        System.out.println((st*3600)+(dk*60)+sn+" "+"saniye");
    }
}
