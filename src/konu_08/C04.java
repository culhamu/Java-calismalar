package konu_08;

public class C04 {
    public static void main(String[] args) {
        /*
        // input olarak verilen bir Stringde
        // index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java  output: JaVa
         */
        String str="Java candir";


        for (int i = 0; i <str.length() ; i++) {
          if ((i%2)==0){
              System.out.print(str.substring(i,i+1).toUpperCase());

          }else System.out.print(str.substring(i,i+1).toLowerCase());


        }



    }
}
