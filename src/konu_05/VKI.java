package konu_05;

import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {
        /*
        Soru 10-)  Klasik Soru :slightly_smiling_face:
        Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

        **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
         Kullanıcıya aşağıdaki gibi mesaj verin:

            Eğer VKİ 18.5'ten az ise --> zayıfsınız
            Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
            Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
            VKİ 30'a eşit veya daha fazlaysa --> obez
            ÖRNEK : Ağırlık : 71
		            Boy : 1,72
		    ÇIKTI :VKİ değeriniz : 23.99945916711736 Kilonuz ideal (edited)
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Kilonuz: ");
        int Kilo=scan.nextInt();
        System.out.println("Boyunuz(Ör:1,77) : ");
        double boy=scan.nextDouble();

        double vki=Kilo/(boy*boy);

        if (vki<18.5){
            System.out.println("Zayıfsınız");
        } else if (vki>=18.5&&vki<25) {
            System.out.println("Ideal Kilodasınız");

        } else if (vki>=25&&vki<30) {
            System.out.println("Şişmansınız ( Hamur işlerinden uzak durun :) )");

        }else System.out.println("Obezsiniz (Allah yardımcınız olsun )");
    }
}
