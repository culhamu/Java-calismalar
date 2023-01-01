package Konu_03;

import java.util.Scanner;

public class Quiz_06 {
    public static void main(String[] args) {
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız");
        String str= scan.nextLine();
        String terstenStr="";

        for (int i = str.length()-1; i>=0 ; i--) {
            terstenStr+=str.substring(i,i+1);



        }
        System.out.println(terstenStr);
    }
}
