package konu_02;

public class Quiz_12 {
    public static void main(String[] args) {
        // input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin
        int input=4737;
        for (int i = 2; i <input ; i++) {
            if (input%i==0)

                System.out.println("sayı asal sayı degil");
            break;



        }
        System.out.println("sayı asal sayı");
    }
}
