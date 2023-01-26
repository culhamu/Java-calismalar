package konu_11;

public class Q06 {
    public static void main(String[] args) {
        // input olarak verilen bir Stringde
        // index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java  output: JaVa



    }public static String tersStr (String str){
         str="Java candir";
        String yeniStr="";

        for (int i = 0; i < str.length(); i++) {
            if (i%2==0){
                yeniStr+=str.toUpperCase().charAt(i);
            }else yeniStr+=str.toLowerCase().charAt(i);

        }
        System.out.println(yeniStr);
return yeniStr;
    }
}
