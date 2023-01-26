package konu_02;

public class Quiz_13 {
    public static void main(String[] args) {
        // eger sart i'nin hicbir degeri icin true olmuyorsa
        // loop calisir ama loop body'si devreye hic girmediginden
        // islem yapilmaz
        // input olarak verilen sayidan bire kadar tum sayilari yazdirin
        int input=23;
        for (int i = input; i >0 ; i--) {
            System.out.print(i+" ");
        }
    }
}
