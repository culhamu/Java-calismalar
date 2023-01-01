package Konu_05;

public class KarakterKontrolu {
    public static void main(String[] args) {
        /*
        Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
        yazınız.
        Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
        ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
        ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
         */
        String str="ali";
        char ilkKrk=str.charAt(0);
        char sonKrk=str.charAt(str.length()-1);

        boolean ilkKrkBuyukMu=ilkKrk>='A'&&ilkKrk<='Z';
        boolean sonKrkNoktaMi=sonKrk=='.';

        boolean sonuc=ilkKrkBuyukMu&&sonKrkNoktaMi;

        System.out.println(sonuc);
    }
}
