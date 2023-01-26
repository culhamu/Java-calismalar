package konu_15;

public class arrays {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */
        int[] arr={12, 5, 8,9,6};


        int ortadakiAray=arr.length/2;

       int yeniArray=arr[ortadakiAray];

        System.out.println(yeniArray);


    }
}
