package konu_09;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //  Ornek :  input : 16, output: 4
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int karekok=1;
        boolean sonuc=false;

        do {
            if (karekok*karekok==sayi){
                System.out.println(karekok);
                sonuc=true;
                break;

            }else {
                karekok++;
            }


        }while (karekok*karekok<=sayi);
        System.out.println(sonuc);

    }
}
