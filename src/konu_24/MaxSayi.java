package konu_24;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MaxSayi {
        static Scanner scan=new Scanner(System.in);
        static int max;
        static int sayi;
        public static void main(String[] args) {
            // kullanicinin girdigi 5 sayidan en
            //buyuk olan sayiyi yazdiriniz

            int arr[]=new int[6];

            for (int i = 1; i <arr.length; i++) {
                System.out.println("lutfen " + i+ " inci sayiyi giriniz");
                arr[i-1]=scan.nextInt();
            }
            System.out.println("girdiginiz sayilar : " + Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>max) {
                    max=arr[i];
                }

            }
            System.out.println("girdiginiz sayilarin en buyugu " + max );




    }
}
