package Konu1;

import java.util.Scanner;

public class Ders01 {
    public static void main(String[] args) {
        // Kullanicidan ismini alin
        // ve girilen ismi buyuk harflerle yazdirin
        // Kullanicidan deger almak icin 3 islem yapmamiz gerekir
        // 1.adim scanner objesi olusturmak
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println(isim.toUpperCase());

    }
}
