package konu_12;

public class Q02 {
    public static void main(String[] args) {
        // 2 basamakli sayilardan 7 ile bolunebilenleri yazdirin
        int sayi=10;
        do {
            if (sayi%7==0){
                System.out.print(sayi+" ");
            }sayi++;

        }while (sayi<100);
    }
}
