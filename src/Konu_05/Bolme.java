package Konu_05;

import java.util.Scanner;

public class Bolme {
    public static void main(String[] args) {
        /*
        120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        ardışık tam sayı arasında boşluk bırakarak yazınız.
         */


       String s="";
        for(int i=120; i>10; i--){
            if(i%4==0 && i%6==0){
                s = s + i + " ";
            }
        }
        System.out.println(s);
        int i=120;

        while (i>10){
            if (i%4==0 && i%6==0) {
                s = s + i + " ";
            }i--;

        }
        System.out.println(s);







    }
}
