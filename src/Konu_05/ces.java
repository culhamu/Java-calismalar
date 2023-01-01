package Konu_05;

public class ces {
    public static void main(String[] args) {
        /*
        Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        Örneğin; accessories ´ ces
         */
        String str1="nasılsın";
        char str2='ı';
        int sayac=0;

        for (int i = 0; i <=str1.length()-1; i++) {
            if (str1.charAt(i)==str2){
                sayac++;

            }


        }System.out.println(sayac+" ");

    }
}
