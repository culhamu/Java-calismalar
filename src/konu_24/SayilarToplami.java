package konu_24;
import java.util.Scanner;




public class SayilarToplami {

    static Scanner scan=new Scanner(System.in);
    static int sayi;
    static int rakamlarToplami;
    static int rakam;
    static boolean bln=false;

        public static void main(String[] args) {
		/* Bir Java programı yazın
		 ve girilen bir tamsayının rakamlarının toplamını hesaplayın.*/

            sayiGirdirme();



        }
        private static void sayiGirdirme() {
            System.out.println("agam integer sayi gir");
            while (!bln) {
                if (scan.hasNextInt()) {
                    sayi = scan.nextInt();
                    System.out.println("tebrikler agam integer girmeyi basardin : " + sayi);
                    if (sayi<=0) {
                        System.out.println("integer girdin ama pozitif tamsayi gir");
                    }
                    else {
                        rakamlarToplami(sayi);
                    }

                }
                else if (scan.hasNextDouble()) {
                    double d = scan.nextDouble();
                    System.out.println("double girdin: " + d);
                    sayiGirdirme();
                }


                else {
                    String s = scan.next();
                    System.out.println("string girdin: " + s);
                    sayiGirdirme();
                }
            }

        }


        private static void rakamlarToplami(int sayi) {
            while (sayi!=0) {
                rakam=sayi%10;
                rakamlarToplami+=rakam;
                sayi/=10;

            }

            System.out.println("girdigin sayinin rakamlar toplami " + rakamlarToplami);





    }


}
