package Konu_12;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //  Ornek :  input : 16, output: 4
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayi giriniz");
        int sayi= scan.nextInt();
        boolean sonuc=false;
        int karekok=1;
        do {
            if (karekok*karekok==sayi){
                System.out.println("girilen sayı karekoktür");
                sonuc=true;
                break;
            }else
                karekok++;

        }while (karekok*karekok<=sayi);

        System.out.println(sonuc);
    }
}
