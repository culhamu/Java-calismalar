package konu_05;

import java.util.Scanner;

public class İkiSayiyiToplama {
    public static void main(String[] args) {
        /*
        Soru 12-)
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
        Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme (edited)
         */

        double a,b;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 adet tam sayi giriniz");
        a=scan.nextDouble();
        b=scan.nextDouble();
       double toplam=a+b;
        String uzunluk=String.valueOf(toplam);
        String aStr=String.valueOf(a);
        String bStr=String.valueOf(b);

        if (aStr.length()>10 || bStr.length()>10 || uzunluk.length()>10){
            System.out.println("Fazla Yüklenme");

        }else System.out.println(toplam);





    }
}
