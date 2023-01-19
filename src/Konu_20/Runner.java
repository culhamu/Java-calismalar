package Konu_20;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //polymorphism kullanarak beyblade programı yapıyoruz
        //burda daha önce yaptığımız 6 tane class ı kulanacağız
        System.out.println( "BEYBLADE PROGRAMINA HOŞGELDİNİZ");
        System.out.println( "Çıkış için q ya basınız");
        //kullanıcının tercihini almak için Scanner objesi oluşturuyoruz
        Scanner scan=new Scanner(System.in);
        //tercih bitirinceye kadar devam edeceği için while(true) döngüsü açıyoruz
        while (true){
            System.out.println("Üretmek istediğniz beyblade ismini giriniz :" +
                               "\nExample:Dragon,Drayga,Dranza,Draciel");
            String islem=scan.nextLine();
            //burda tercihleri kontrol etmek için if bloğu açıyoruz
            if (islem.equalsIgnoreCase("q")){
                System.out.println("İşlemden çıkılıyor...");
                System.exit(0);
            }else {
                //burda tercihin q olmaması durumunu kontrol ediyoruz
                //beybladeUret classından beyblade üretebilmek için beyblade objesi oluşturuyoruz

                BeybladeUret beybladeUret=new BeybladeUret();
                //daha sonra beybladeUret methodunu kullanabilmek için
                beybladeUret.beybladeUret(islem);
                //null durumunu kontrol etmek için
                if (beybladeUret.beybladeUret(islem)==null){
                    System.out.println("Lütfen geçerli bir işlem giriniz...");
                }else {
                    beybladeUret.beybladeUret(islem).bilgileriGoster();
                    beybladeUret.beybladeUret(islem).saldiri();
                    beybladeUret.beybladeUret(islem).kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
