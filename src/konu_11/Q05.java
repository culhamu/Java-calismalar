package konu_11;

public class Q05 {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        kontrol edin ve sonucu yazdirin.
         */
        int sayi=19;
        String sonuc="asal";
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sonuc="asal değil";
                break;
            }


        }
        System.out.println(sonuc);

    }
}
