package konu_01;

public class Ders_06 {
    public static void main(String[] args) {
        // Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : "15.30 €" , input2 : "11.40 €"
        // output : 26.70 €
        String input1="15.30$";
        String input2="11.40$";
        double dbl1=Double.valueOf(15.30);
        double dbl2=Double.valueOf(11.40);
        double output=dbl1+dbl2;
        System.out.println(output+"$");


    }
}
