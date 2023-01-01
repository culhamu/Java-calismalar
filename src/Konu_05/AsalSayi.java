package Konu_05;

public class AsalSayi {
    public static void main(String[] args) {
        //input olarak verilen sayının asal olup olmadığını kontrol edelim
        int input=21;
        String sonuc="Sayı asal ";
        for (int i = 2; i <input ; i++) {
            if (input%i==0){
              sonuc="sayı asal değil";
                break;
            }


        }System.out.println(sonuc);
    }
}
