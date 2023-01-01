package Konu_13;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        // verilen 2 katli MDA'deki tum sayilarin toplamini yazdiran bir method olusturun
        tumSayilariTopla(arr);
    }public static void tumSayilariTopla(int[][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];

            }
            System.out.print(toplam);
            System.out.println("");

        }

    }
}
