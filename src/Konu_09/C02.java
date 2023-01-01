package Konu_09;

public class C02 {
    public static void main(String[] args) {
        // verilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri yazdirin
        char i='a';
        char s='g';

        do {
            System.out.print(i+" ");
            i=(char)(i+1);

        }while (i<=s);
    }
}
