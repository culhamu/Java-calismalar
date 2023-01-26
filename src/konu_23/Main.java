package konu_23;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havaalanına hoşgeldiniz...");
        String sartlar="Yurtdışı çıkış kuralları : \n"+
                       "Herhangibir siyasi yasağınızın bulunmaması gerekiyor... \n"+
                       "600 TL harç bedelini yatırmanız gerekiyor...\n"+
                       "Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        String message="Yurtdışı şartlarının hepsini sağlamanız gerekiyor";

        while (true){
            System.out.println("*************************************************");
            System.out.println(sartlar);
            System.out.println("*************************************************");
            Yolcu yolcu=new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(2000);
            if (yolcu.yurtdisiHarci()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasağınız kontrol ediliyor...");
            Thread.sleep(2000);
            if (yolcu.siyasiYasak()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(2000);
            if (yolcu.vizeDurumu()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam .Yurt dışına çıkabilirsiniz");
            break;
        }
    }
}
