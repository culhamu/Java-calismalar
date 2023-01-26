package konu_03;

public class Quiz_02 {
    public static void main(String[] args) {
        // input olarak verilen bir Stringde
        // index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java  output: JaVa
        String input= "Java candir, Selenium heyecandir";

        for (int i = 0; i <input.length(); i++) {
            if (i%2==0){
                System.out.print(input.substring(i, i + 1).toUpperCase());
            }else {
                System.out.print(input.substring(i,i+1).toLowerCase());
            }

        }
    }
}
