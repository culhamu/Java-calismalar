package Konu_14;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunluğunu giriniz");
        int uzunluk=scan.nextInt();
        arrayOlustur(uzunluk);
    }

    private static void arrayOlustur(int uzunluk) {
        int arr[]=new int[uzunluk];
        Random rnd=new Random();
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rnd.nextInt(100);
            toplam+=arr[i];

        }
        int alt=0;
        int ust=0;
        int esit=0;
        double ort=toplam/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ort){
                alt++;

            }else if (arr[i]>ort){
                ust++;


            }else esit++;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("adet sayı ort dan küçük:"+alt+
                "adet sayı ort dan küçük:"+ust+"adet sayı oert esit"+ort);
    }
}
