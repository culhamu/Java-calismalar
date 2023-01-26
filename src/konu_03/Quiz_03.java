package konu_03;

public class Quiz_03 {
    public static void main(String[] args) {
        // input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin
        int input=23;
        for (int i = 2; i <=input ; i++) {

            if (input%i==0){
                System.out.println("sayı asal değildir");
                break;
            }else {
                System.out.println("Sayı asaldır");
                break;
            }
        }
    }
}
