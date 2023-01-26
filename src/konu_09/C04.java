package konu_09;

public class C04 {
    public static void main(String[] args) {
        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*
        String str= "Ali Can?";
        str = str.replaceAll("[^A-Z]", "");
        String str2 = "";
        for(Integer i=0; i<str.length(); i++){
            String r = str.substring(i,i+1);
            str2 = str2 + r + '*';
         }
        System.out.println(str2);
    }
}
