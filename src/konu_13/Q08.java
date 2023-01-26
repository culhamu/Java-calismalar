package konu_13;

import java.util.Arrays;

public class Q08 {
    public static void main(String[] args) {
        String str= "Java her gecen gun guzellesiyor";
        // str'da kac kelime var ?
        // split method'u istedigimiz String'i, istedigimiz ayirac kullanarak
        // parcalara ayirmamiza imkan verir
       String[] yeniStr= str.split(" ");
        System.out.println(Arrays.toString(yeniStr));
        System.out.println(yeniStr.length);
    }
}
