package Konu_13;

public class Q05 {
    public static void main(String[] args) {
        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.
        int[] arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int aranansayi=2;

    }public static void arrbulma(int[] arr,int arananEleman){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananEleman){
                sayac++;
            }

        }if (sayac==0){
            System.out.println("aranan array de aranan eleman bulunmamaktadır");
        }else System.out.println("aranan array de aranan eleman: "+sayac);

    }
}
