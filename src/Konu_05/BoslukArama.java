package Konu_05;

public class BoslukArama {
    public static void main(String[] args) {
          /*
        Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.
        Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘Ali Can’ için konsolda true yazmalıdır.
         */
        String str="Ali  can";
        if (str.indexOf(" ")==str.lastIndexOf(" ")){
            System.out.println(true);
        }else System.out.println(false);

    }
}
