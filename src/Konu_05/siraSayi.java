package Konu_05;

public class siraSayi {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }
            System.out.println("");


        }
        for (int j = 3; j >= 1; j--) {
            for (int k = 1; k <= j; k++) {

                System.out.print(k + " ");


            }
            System.out.println("");
        }
    }
}