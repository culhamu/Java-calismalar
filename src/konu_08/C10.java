package konu_08;

public class C10 {
    public static void main(String[] args) {
            /*
        input degerine kadar her satirda * sayisini bir artirip
        sonra azaltarak asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
         */
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");



            }for (int j = 1; j <4; j++) {
            for (int k = j; k <4 ; k++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
