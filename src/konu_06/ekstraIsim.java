package konu_06;

import java.util.Scanner;

public class ekstraIsim {
    public static void main(String[] args) {
        /*
        Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın.
        Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun
        ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
        Loopun içerisinde StringM methodlarından  yararlanalım!
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen en az 5 harfli bir kelime giriniz");
        String kelime=scan.next();
        String yeniKelime="";

        for (int i = 1; i <=2 ; i++) {
            yeniKelime=kelime.substring(kelime.length()-3);
            yeniKelime+=yeniKelime;}

        if (kelime.length()<5) System.out.println("Lütfen en az 5 harfli bir kelime giriniz");

        else System.out.println(yeniKelime);


        }

    }

