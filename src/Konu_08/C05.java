package Konu_08;

public class C05 {
    public static void main(String[] args) {
        /*
         // input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin
         */
        int sayi=21;
        String sonuc="asal";


        for (int i = 2; i <=sayi ; i++) {
            if (sayi%i==0){
                sonuc="asal değil";
                break;
            }


        }System.out.println(sonuc);


    }
}
