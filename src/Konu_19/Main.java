package Konu_19;

import java.util.Scanner;

public class Main {
    /*
    Çalışanlar Programı
    Çalışanlar adında bir üst sınıf

    Yazılımcılar adında bir alt sınıf
    Yöneticiler adında bir alt sınıf

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Çalışan proğramına hoşgeldiniz...");
        String islemler="İşlemler...\n"+
                        "1- Yazılımcı işlemleri\n"+
                        "2- Yönetici işlemleri\n"+
                        "Çıkış için q'ya basınız";
        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("***************************************");
        
        while (true){
            System.out.print("Yapmak istediğiniz işlemi seçiniz");
            String tercih=scan.next();
            scan.nextLine();
            if (tercih.equalsIgnoreCase("q")){
                System.out.println("İşlemden çıkılıyor...");
                break;
            } else if (tercih.equals("1")) {
                Yazilimci yazilimci=new Yazilimci("Muatafa","Çulha",158,"Java,Phyton");
                while (true){
                    String yazilimci_islem="1- Format at\n"+
                                           "2- Bilgileri göster\n" +
                                           "Çıkış için q'ya basınız";
                    System.out.println(yazilimci_islem);
                    System.out.print("Tercihiniz : ");
                    String y_islem=scan.nextLine();
                    if (y_islem.equalsIgnoreCase("q")){
                        System.out.println("Yazılımcı İşleminden çıkılıyor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("İşletim sistemi");
                        String isletimSistemi=scan.nextLine();
                        yazilimci.formatAt(isletimSistemi);

                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgilergoster();
                    }else {
                        System.out.println("Geçersiz yazılımcı işlemi");
                    }
                }
            } else if (tercih.equals("2")) {
                    Yonetici yonetici=new Yonetici("Ahmet","Doğan",957,15);
                    String yonetici_islem="Yönetici işlemleri:\n" +
                                          "1- Zam yap\n" +
                                          "2- Bilgileri göster\n" +
                                          "3- Çıkış için q'ya basınız";
                System.out.println(yonetici_islem);
                while (true){
                    System.out.print("İşlem seçiniz :");
                    String islem=scan.nextLine();
                    if (islem.equalsIgnoreCase("q")){
                        System.out.println("Yönetici işlemden çıkılıyor");
                        break;
                    } else if (islem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz");
                        int zamMiktari=scan.nextInt();
                        scan.nextLine();
                        yonetici.zamYap(zamMiktari);
                    } else if (islem.equals("2")) {
                        yonetici.bilgilergoster();

                    }else {
                        System.out.println("Geçersiz Yönetici işlemi...");
                    }
                }

            }
else System.out.println("Geçersiz işlem");
        }

    }
}
