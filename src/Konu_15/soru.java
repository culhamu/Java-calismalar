package Konu_15;

import java.util.Arrays;

public class soru {
    public static void main(String[] args) {
        /*
        String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
         */
        String[] arr={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int enkisaArr=arr[0].length();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()<enkisaArr){

                enkisaArr=arr[i].length();
            }

        }
        System.out.println(enkisaArr);
    }
}
