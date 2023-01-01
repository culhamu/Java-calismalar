package Konu_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach6 {
    public static void main(String[] args) {
        // Verilen iki array'i olusturun
        Integer[] array1 = {1, 2, 3, 4, 5,3,3,4,5,8,9};
        Integer[] array2 = {3, 4, 5, 6, 7,3,5,8,8,9,9};

        // Ortak elemanlar icin bir liste olusturalım
        List<Integer> commonElements = new ArrayList<>();

        // Array'leri Arrays.asList() metoduyle liste haline getirip ve
        // for-each dongusuyle tarayalım
        for (int element : Arrays.asList(array1)) {
            // Eger array2 icinde de mevcutsa, ortak elemanlarin listesine ekleyelim
            if (Arrays.asList(array2).contains(element)) {
                if (!commonElements.contains(element))
                commonElements.add(element);
            }
        }

        // Ortak elemanlar listesini yazdirin
        System.out.println(commonElements);
    }
}
