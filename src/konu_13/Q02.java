package konu_13;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
        // Verilen bir String array'de
        // istenen bir harfi iceren kelimeleri silip, yerine null yazdirin
        String[] arr={"Ali","Hüseyin","Veli","Murtaza"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")){
                arr[i]=null;


            }

        }System.out.println(Arrays.toString(arr));
    }
}
