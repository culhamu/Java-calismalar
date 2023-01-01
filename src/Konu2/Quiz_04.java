package Konu2;

import java.util.Scanner;

public class Quiz_04 {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfeb bir şifre giriniz");
        String str= scan.nextLine();
        int flag=0;
        if (!(str.charAt(0)>='a'&&str.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        if (!((str.length()-1)>=0&&(str.length()-1)<=9)){
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        if ((str.contains(" "))){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        if (!(str.length()>10)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;

        }
        if (flag==0) System.out.println("Şifreniz başarıyla kaydedildi");
    }
}
