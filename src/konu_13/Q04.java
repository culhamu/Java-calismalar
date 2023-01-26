package konu_13;

public class Q04 {
    public static void main(String[] args) {
        // Bir marketin fiyatlarini tutan bir array var
        // Bu marketteki en yuksek ve en dusuk fiyatlari yazdiran bir method olusturun
        int [] fiyatlar={1,5,54,4,654,54};
        int endusukfiyat=fiyatlar[0];
        int enyuksuekfiyat=fiyatlar[0];

        for (int i = 0; i < fiyatlar.length; i++) {
            if (fiyatlar[i]<endusukfiyat){
                endusukfiyat=fiyatlar[i];
            }if (fiyatlar[i]>enyuksuekfiyat){
                enyuksuekfiyat=fiyatlar[i];
            }

        }
        System.out.println("en düşük fiyat: "+endusukfiyat);
        System.out.println("en yüksek fiyat: "+enyuksuekfiyat);
    }
}
