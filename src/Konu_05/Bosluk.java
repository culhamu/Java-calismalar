package Konu_05;

import java.util.Scanner;

public class Bosluk {
    public static void main(String[] args) {
        /*
        Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
        yazınız.
        Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
        ‘Ali’ için kodunuz konsolda true yazmalıdır
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String str=scan.nextLine();

        if (str.trim()==str){
            System.out.println(true);
        }else System.out.println(false);
    }
}
