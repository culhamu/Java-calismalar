package konu_01;

import java.util.Scanner;

public class Ders04 {
    public static void main(String[] args) {

        // kullanicidan 2 tamsayi alin
        // 1.tamsayiyi 2.ye bolup sonucu ondalik olarak yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("Sayilarin bölümü:"+(double)(sayi1/sayi2));
    }
}
