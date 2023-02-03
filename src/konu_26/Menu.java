package konu_26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu implements Iterable {
    private ArrayList<String> kanallar = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String islemler = "Kumanda programına hosgeldiniz...\n" +
            "1-Kanal Ekle\n" +
            "2-Kanal Sil\n" +
            "3-Kanal Listele\n" +
            "4-Kanal Sayısı Öğren\n" +
            "Çıkış için Q'ya Basınız...";
    public class KumandaIterator implements Iterator<String>{
       private  int index=0;
        @Override
        public boolean hasNext() {
          if (index>=kanallar.size()){
              return false;
          }else {
              return true;
          }

        }

        @Override
        public String next() {
            String kanal=kanallar.get(index);
            index++;
            return kanal;
        }

    }

    public void menu() {
        System.out.println(islemler);

        while (true) {
            System.out.println("Lütfen işleminizi seçiniz...");
            String tercih = scan.nextLine();
            if (tercih.equalsIgnoreCase("q")) {
                System.out.println("Sistemden çıkılıyor....");
                System.exit(0);
            } else if (tercih.equals("1")) {
                kanalEkle();

            } else if (tercih.equals("2")) {
                kanalSil();


            } else if (tercih.equals("3")) {
                kanalListele();


            } else if (tercih.equals("4")) {
                kanalSayisiOgren();


            } else {
                System.out.println("Geçersiz işlem lütfen tekrar deneyiniz...\n" +
                        islemler);
            }
        }
    }

    private void kanalSayisiOgren() {
        System.out.println("TV Kanal listesinde bulunan kanal sayısı : "+kanallar.size());
    }

    private void kanalListele() {
       if (kanallar.size()==0){
           System.out.println("Gösterilecek kanal bulunmamaktadır..");
       }else {
           for (String kanal:kanallar) {
               System.out.println(kanal);
           }
       }
    }

    private void kanalSil() {
        System.out.println("Lütfen silmek istediğiniz kanalın ismini giriniz");
        String kanal = scan.nextLine();
        if (kanallar.contains(kanal)) {
            kanallar.remove(kanal);
            kanalListele();
        } else {
            System.out.println("Belirttiğiniz kanal kanal listesinde bulunmamaktadır...\n" + islemler);
        }
    }

    private void kanalEkle() {
        System.out.println("Lütfen eklemek istediğiniz kanalın ismini giriniz ");
        String kanal = scan.nextLine();
        if (!kanallar.contains(kanal)) {
            kanallar.add(kanal);
            System.out.println(islemler);
        } else {
            System.out.println("Belirttiğiniz kanal kanal listesinde bulunmaktadır...");
            System.out.println(islemler);
        }


    }

    @Override
    public Iterator iterator() {
       return new KumandaIterator();
    }
}
