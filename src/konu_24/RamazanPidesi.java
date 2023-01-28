package konu_24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamazanPidesi {
    public static void main(String[] args) throws InterruptedException {
        //Ramazan pidesi uygulaması

        //Fırın 1(dahil) ile 10(dahil) arasi pide çıkacak.Kuyruktakiler pideyi almaya çalışacak...

        Random rnd=new Random();
        System.out.println("Ramazan pidesi uygulaması...");

        Queue<String> pide_kuyrugu=new LinkedList<>();

        pide_kuyrugu.offer("Mustafa");
        pide_kuyrugu.offer("Tayfur");
        pide_kuyrugu.offer("Mahmut");
        pide_kuyrugu.offer("Yusuf");
        pide_kuyrugu.offer("Furkan");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Büşra");
        pide_kuyrugu.offer("Burcu");
        pide_kuyrugu.offer("Hüseyin");
        pide_kuyrugu.offer("Havva");

        int pide_sayisi=1+ rnd.nextInt(10);
        System.out.println("Pideler çıkıyor...\n"+
                           "Çıkan pide sayısı : " +pide_sayisi);
        Thread.sleep(3000);

        while (pide_sayisi!=0){

            System.out.println(pide_kuyrugu.poll()+" pideyi aldi...");
            pide_sayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı...");

    }
}
