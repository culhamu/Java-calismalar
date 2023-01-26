package konu_22;

import java.util.*;

public class Menu {
    Scanner scan=new Scanner(System.in);
    Map<Integer, List<Kitapci>> kitapciMap=new HashMap<>();
    private int kitapNo=1000;


    /*

 * Bir kitapci icin program yapalim Kitap no 1000'den baslayarak sirali no olsun
 * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
 *
 * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
 * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
 * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6-   k

     */
     public void menu(){
         System.out.println("Su Yolcu kitapevi : \n" +
                            "1- Kitap ekle \n"+
                            "2- Numara ile kitap görüntüle \n"+
                            "3- Bilgi ile kitap görüntüle \n"+
                            "4- Numara ile kitap sil \n"+
                            "5- Tum kitaplari listele \n"+
                            "Çıkış=Q \n"+
                            "Seciminiz : "
                            );
         String secim=scan.nextLine();
         while (!secim.equals("q")){
             switch (secim){
                 case "1":
                     kitapekle();
                     break;
                 case "2":
                     noIleKitapGoruntuleme();
                     break;
                 case "3":
                     bilgiIleKitapGoruntule();
                     break;
                 case "4":
                     noIleKitapSil();
                     break;
                 case "5":
                     listeleme();
                     break;
                 case "q":
                 case "Q":
                    bitir();
                    break;
                 default:
                     System.out.println("Geçersiz işlem girdiniz lütfen tekrar deneyin...");
                     break;
             }
         }
    }

    private void bitir() {
        System.out.println("Su Yolcu kitapevinden çıkılıyor yine bekleriz...");
        System.exit(0);
    }

    private void listeleme() {


        Set<Map.Entry<Integer, List<Kitapci>>> entrySeti = kitapciMap.entrySet();

        for (Map.Entry<Integer, List<Kitapci>> eachEntry: entrySeti) {

            System.out.println(eachEntry.getKey()+" "+eachEntry.getValue());
        }menu();
    }

    private void noIleKitapSil() {
        System.out.println("Lütfen silmek istediğiniz kitabın No'sunu giriniz...");
        int kitapNo=scan.nextInt();
        scan.nextLine();

        Set<Integer> setMapNo=kitapciMap.keySet();
        for (Integer each:setMapNo) {
            if (each==kitapNo){
                kitapciMap.remove(kitapNo);
                menu();
                return;
            }else System.out.println("Böyle bir kitap bulunmamaktadır..");
            menu();
        }
    }

    private void bilgiIleKitapGoruntule() {
        System.out.println("Görüntülemek istediğiniz kitabın adını veya yazar adını giriniz...");
        String bilgi=scan.nextLine();
        Set<Map.Entry<Integer,List<Kitapci>>> kitapciSet=kitapciMap.entrySet();
        for (Map.Entry<Integer,List<Kitapci>> eachSet:kitapciSet) {
            for (Kitapci eachSetList:eachSet.getValue()) {
                if (eachSetList.getKitapAdi().equalsIgnoreCase(bilgi)||eachSetList.getYazarAdi().equalsIgnoreCase(bilgi)){
                    System.out.println(eachSetList);
                    menu();
                    return;
                }
            }
        } System.out.println("böyle bir kitap bulunmamaktadır..");
        menu();
        return;
    }

    private void noIleKitapGoruntuleme() {
        System.out.println("Lütfen görüntülemek istediğiniz kitabın No'sunu giriniz...");
        int kitapNo=scan.nextInt();
        scan.nextLine();

        Set<Integer> setMapNo=kitapciMap.keySet();
        for (Integer each:setMapNo) {
            if (each==kitapNo){
                System.out.println("Kitap numarası :"+each+" olan kitap "+kitapciMap.get(kitapNo));
                menu();
                return;
            }else System.out.println("Böyle bir kitap bulunmamaktadır..");
            menu();
        }


    }

    private void kitapekle() {
        System.out.println("Lütfen kitap adını giriniz");
        String kitapAdi=scan.nextLine();
        System.out.println("Lütfen yazar adını giriniz");
        String yazarAdi=scan.nextLine();
        System.out.println("Lütfen kitap fiyatini giriniz");
        int fiyat= scan.nextInt();
        scan.nextLine();
        List<Kitapci> kitapciList=new ArrayList<>();
        Kitapci kitapci=new Kitapci<>(kitapAdi,yazarAdi,fiyat);
        kitapciList.add(kitapci);
        kitapciMap.put(kitapNo++,kitapciList);
        System.out.println(kitapciMap);
        menu();
    }

}
