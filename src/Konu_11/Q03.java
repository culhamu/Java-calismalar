package Konu_11;

public class Q03 {
    public static void main(String[] args) {
        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */
        int faktoriyel=1;
        for (int i = 6; i >=2 ; i--) {
            faktoriyel*=i;
            System.out.print(i+"*");
        }
        System.out.print("1 = "+faktoriyel);
    }
}
