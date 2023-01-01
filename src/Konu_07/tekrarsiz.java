package Konu_07;

public class tekrarsiz {
    public static void main(String[] args) {
        /*
        Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        Örnek; 223878 ´ 37
         */
        int sayi=223878;
        String sayiInt=String.valueOf(sayi);
        String sayiInt2="";

        for (int i = 0; i <sayiInt.length(); i++) {
            String r=sayiInt.substring(i,i+1);
            if (sayiInt.indexOf(r)==sayiInt.lastIndexOf(r)){
                sayiInt2+=r;
            }

            
        }System.out.println(sayiInt2);
    }
}
