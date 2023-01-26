package konu_08;

public class C02 {
    public static void main(String[] args) {
        /*
        // verilen sayinin faktoryelini hesaplayin
        // 5! = 5*4*3*2*1
         */
        int fakt=1;
        int sayi=5;
        for (int i = sayi; i >=1 ; i--) {

            fakt*=i;



        }
        System.out.println(sayi+"!"+"="+fakt);
    }
}
