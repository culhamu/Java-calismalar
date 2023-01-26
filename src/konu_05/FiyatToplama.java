package konu_05;

public class FiyatToplama {
    public static void main(String[] args) {
        /*
        String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
         */
        String gomlekFiyat = "$12.99";
        String kitapFiyat ="$35.99";

    char prBrm=gomlekFiyat.charAt(0);
    gomlekFiyat=gomlekFiyat.replace("$","").trim();
    kitapFiyat=kitapFiyat.replace("$","").trim();

        System.out.println(Double.parseDouble(gomlekFiyat)+Double.parseDouble(kitapFiyat)+" "+prBrm);


    }
}
