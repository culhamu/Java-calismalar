package Konu_13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
        // Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        //  Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]
        int[] arr = {4,5,6,7};
        arr=sagakaydir(arr);
        System.out.println(Arrays.toString(arr));

    }public static int [] sagakaydir(int[] arr){
        int temp=arr[arr.length-1];

        for (int i = arr.length-1 ;i >=1; i--) {
            arr[i]=arr[i-1];


        }arr[0]=temp;
        return arr;

    }
}
