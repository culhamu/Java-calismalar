package konu_06;

import java.util.Scanner;

public class AyniKarakter {
    public static void main(String[] args) {
        /*
        Soru 14-)
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise
         konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
        Ipucu:
        IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim giriniz");
        String Isim=scan.nextLine();

        if (!(Isim.charAt(0)==Isim.charAt(1))&&!(Isim.charAt(0)==Isim.charAt(2))){
            System.out.println("Dize benzersiz karakterlere sahip");
        }else System.out.println("Dize yinelenen karakterlere sahip");

        }

    }

