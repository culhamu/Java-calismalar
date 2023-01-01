package Konu1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ders_08 {
    public static void main(String[] args) {
        /*
        Bir dik üçgenin hipotenüsünü bulunuz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dik üçgenin dik kenarlarını tamsayı olarak giriniz");
        int knr1= scan.nextInt();
        int knr2= scan.nextInt();
        double hptns=Math.sqrt((knr1*knr1)+(knr2*knr2));
        System.out.println("Dik üçgenin hipotenüsü:"+hptns);

    }
}
