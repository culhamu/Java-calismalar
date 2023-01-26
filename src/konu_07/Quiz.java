package konu_07;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String sifre=scan.nextLine();
        int flag=0;
        int i=sifre.length()-1;

        do {
            if (!(sifre.charAt(0) >='a' && sifre.charAt(0)<='z')){
                System.out.println("İlk harf küçük olmalı");
                flag++;
            }if (!(sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z')){
                System.out.println("son karakter büyük harf olmalı olmali");
                flag++;
            }if (Character.isSpaceChar(sifre.charAt(0))){
                System.out.println("sifre özel karakter içermeli icermemeli");
                flag++;
            }if (sifre.length()<9) {
                System.out.println("uzunlugu en az 8 karakter olmali");
                flag++;
            }
        }while (flag==0);
        System.out.println("Şifre başarı ile kaydedildi");
    }
}
