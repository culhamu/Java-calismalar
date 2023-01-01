package Konu1;

import java.util.Scanner;

public class ders_05 {
    public static void main(String[] args) {
        /*
        Bir aracın kilometrede ne kadar yaktığı ve kaç kilo metre yol yaptığı hakkında bilgi alın
        ve sürücünün toplam ne kadar ödemesi gerektiğini bulun
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("aracınız kilometrede kaç kuruş yakıyor?(örnek:0.32 krş)");
        double krs= scan.nextDouble();
        System.out.print("Aracınızla kaç kilometre gittiniz?");
        int km= scan.nextInt();
        System.out.println("Toplam ödemeniz gereken tutar:"+km*krs+"Tl dir");


    }
}
