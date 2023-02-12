package konu_28;

import java.util.InputMismatchException;
import java.util.Scanner;

class CarpmaException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Sayı çok büyük sayı 10000'den küçük olmalı...");
    }
}
public class HesapMakinesiException {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String islemler="Hesap Makinesi Programına Hoşgeldiniz...\n"+
                        "1-Toplama\n"+
                        "2-Çıkarma\n"+
                        "3-Çarpma\n"+
                        "4-Bölme\n"+
                        "Çıkış : Q\n"+
                        "Lütfen İşleminizi seçiniz : ";
        System.out.println(islemler);
        String tercih=scan.nextLine();

        try {
            switch (tercih){
                case "1":
                    System.out.println("Lütfen işlem için 2 int sayı giriniz...");
                    Integer sayi1=scan.nextInt();
                    Integer sayi2=scan.nextInt();
                    System.out.println("Toplama işlemi sonucu : "+(sayi1+sayi2));
                    break;
                case "2":
                    System.out.println("Lütfen işlem için 2 int sayı giriniz...");
                     sayi1=scan.nextInt();
                     sayi2=scan.nextInt();
                    if (sayi1>sayi2){
                        System.out.println("Çıkarma işlemi sonucu : "+(sayi1-sayi2));
                    }else System.out.println("Çıkarma işlemi sonucu : "+(sayi2-sayi1));
                    break;
                case "3":
                    System.out.println("Lütfen işlem için 2 int sayı giriniz...");
                     sayi1=scan.nextInt();
                     sayi2=scan.nextInt();
                     if (sayi1>10000||sayi2>10000){
                         throw new CarpmaException();
                     }
                    System.out.println("Çarpma işlemi sonucu : "+(sayi1*sayi2));
                    break;
                case "4":
                    System.out.println("Lütfen işlem için 2 int sayı giriniz...");
                     sayi1=scan.nextInt();
                     sayi2=scan.nextInt();
                    System.out.println("Bölme işlemi sonucu : "+(sayi1/sayi2));
                    break;
                case "Q":
                case "q":
                    System.out.println("Hesap makinesi uygulamasından çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz işlem girdiniz işlem sonlandırılıyor...");
                    System.exit(0);
            }
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez...");
        }catch (InputMismatchException e){
            System.out.println("Lütfen input'a uygun veri giriniz...");
        } catch (CarpmaException e) {
            e.printStackTrace();
        }
    }
}
