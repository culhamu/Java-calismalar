package konu_23;

import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurum;



    public  Yolcu() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedeli : ");
        this.harc=scan.nextInt();
        scan.nextLine();
        System.out.print("Herhangibir siyasi yasağınız bulunuyor mu? (evet ya da hayır)");
        String cevap=scan.nextLine();

        if (cevap.equalsIgnoreCase("evet")){
            this.siyasiYasak=true;
        }else {
            this.siyasiYasak=false;
        }
        System.out.print("Vizeniz bulunuyor mu?");
        String cevap2=scan.nextLine();
        if (cevap2.equalsIgnoreCase("evet")){
            this.vizeDurum=true;
        }else {
            this.vizeDurum=false;
        }
    }

    @Override
    public boolean yurtdisiHarci() {
        if (this.harc<600){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın");
            return false;
        }else {
            System.out.println("Yurtdışı harç işlemi tamamlandı");
            return true;
        }

    }

    @Override
    public boolean siyasiYasak() {
        if (this.siyasiYasak){
            System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız!...");
            return false;
        }else {
            System.out.println("Siyasi yasağınız bulunmuyor...");
            return true;
        }

    }

    @Override
    public boolean vizeDurumu() {
        if (this.vizeDurum){
            System.out.println("Vize işlemleri tamam...");
            return true;
        }else{ System.out.println("Vizeniz gideceğinşz ülkeye bulunmamaktasır");
        return false;
        }
    }
}
