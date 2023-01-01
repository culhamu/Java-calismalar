package Konu2;

import java.util.Scanner;

public class Quiz_03 {
    public static void main(String[] args) {
        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız");
        String str= scan.nextLine();
        if (str.contains("is")&&str.contains("ev")){
            System.out.println("Hem ev lazim hem is");
        } else if (str.contains("is")) {
            System.out.println("calismak guzeldir");

        } else if (str.contains("ev")) {
            System.out.println("home home sweet home");

        }else System.out.println("cok calisman lazim");
    }
}
