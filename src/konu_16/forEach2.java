package konu_16;

public class forEach2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        yazdiran bir method olusturun.
         */
        Integer [] arr={2,3,4,6,3,4,6,1,8,5,4};
        arrKareToplam(arr);

    }public static void arrKareToplam(Integer[] arr){

        int toplam=0;
        for (Integer each:arr) {
            toplam+=each*each;


        }
        System.out.println(toplam);
    }
}
