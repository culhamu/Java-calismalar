package Konu_17;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
        Given an integer num, return the number of steps to reduce it to zero.

        In one step, if the current number is even,
        you have to divide it by 2, otherwise, you have to subtract 1 from it.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bolunen sayiyi giriniz");
        int a= scan.nextInt();

        System.out.println(adimsayisi(a));

    } public static int adimsayisi(int bolunen) {
        int adim=0;

        while (bolunen!=0){

            if (bolunen%2==0){
            bolunen/=2;


            }else {
                bolunen=bolunen-1;


            }adim++;
        }
        return adim;
    }
}
