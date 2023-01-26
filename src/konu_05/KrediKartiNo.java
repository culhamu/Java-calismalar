package konu_05;

import java.util.Scanner;

public class KrediKartiNo {
    public static void main(String[] args) {
        /*
        Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
	            Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
                Giriş :
		             > Gandalf Grey 563245879632
                 Çıktı :
		             > İsim : G****** G***
		             > CCN : **** **** 9632 (edited)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı soyadınızı ve kredi kartı numaranızı sırasıyla giriniz");
        String ad=scan.nextLine();
        String soyad=scan.nextLine();
        String krtNo=scan.nextLine();
        int flag=0;
        char adChr=ad.charAt(0);
        char syAd=soyad.charAt(0);

        if (!(adChr>='A'&&adChr<='Z')){
            System.out.println("Adınızın ilk harfi büyük olmalıdır");
            flag++;

        }if (!(syAd>='A'&&syAd<='Z')){
            System.out.println("Soyadınızın ilk harfi büyük olmalıdır");
            flag++;
        }if (!(krtNo.length()==16)){
            System.out.println("Kart numarası 16 haneli olmalı");
            flag++;
        }if (flag==0){
            System.out.println(ad+" "+soyad+" "+krtNo);
        }

    }
}
