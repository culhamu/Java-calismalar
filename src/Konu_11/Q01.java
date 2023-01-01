package Konu_11;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        yazdirin.
         */
        for (int i = 63; i <94; i++) {
            System.out.print((char) (i+1)+" ");

        }
        System.out.println("**************************");
        /*
        Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayi= scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("******************");

    }
}
