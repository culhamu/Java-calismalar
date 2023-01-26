package konu_15;

public class loops {
    public static void main(String[] args) {
        /*
        String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        Örneğin; 'Ali Can?' ==> l*i*a*n*
         */
        String str="Ali Can?";

        String sonStr=str.replaceAll("[A-Z]","*");


        System.out.println(sonStr);
    }
}
