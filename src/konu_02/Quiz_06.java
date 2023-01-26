package konu_02;

public class Quiz_06 {
    public static void main(String[] args) {
        // 1 ile 1000 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin
        int input=1000;
        int toplam=0;
        for (int i = 0; i <=1000 ; i++) {
             toplam+=i;
            System.out.print(toplam+" ");

        }
    }
}
