package konu_05;

import java.util.Scanner;

public class SiraKarakter {
    public static void main(String[] args) {
        //Kullanıcıdan bir karakter alıp okarakterden sonraki 10 karakteri yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütefen bir karakter giriniz");
        char girilenKrk=scan.next().charAt(0);

        for (int i = 1; i <11 ; i++) {

            System.out.print((char)(girilenKrk+i)+" ");

        }
    }
}
