package konu_14;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        //Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle=scan.nextLine();

        System.out.println(sayisalIfadeleriTopla(cumle));
    }

    private static int sayisalIfadeleriTopla(String cumle) {
        int toplam=0;
        String cumleArr[]=cumle.split("");
        for (String each:cumleArr) {
            if (Character.isDigit(each.charAt(0))){
                toplam+=Integer.valueOf(each);
            }
            
        }
        return toplam;
    }
}
