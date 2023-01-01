package Konu1;

import java.util.Scanner;

public class Ders_07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        System.out.print("birinci sayi");
        int sayi1=scan.nextInt();
        System.out.print("ikinci sayi");
        int sayi2=scan.nextInt();

        int temp;
        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("sayıların yeri değişti:\n"+"sayı bir:"+sayi1+"\n"+"sayı iki:"+sayi2);


    }
}
