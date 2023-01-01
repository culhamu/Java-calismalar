package Konu2;

import java.util.Scanner;

public class Quiz_10 {
    public static void main(String[] args) {
        // kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakteri yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
       char krk=scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {


            System.out.print((char) (krk+i )+" ");

        }
    }
}
