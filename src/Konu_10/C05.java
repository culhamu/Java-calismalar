package Konu_10;

import java.util.Arrays;

public class C05 {
    public static void main(String[] args) {
        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //      input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //      output:                       [5, 7, 11]
        // dinamik hale getirebilmek icin once inner array'lerden en kisa olani bulmamiz gerekir
        int[][] arr =  {{3,4,5}, {2,3,6,7}};
        int enkucukindex=arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<enkucukindex){
                enkucukindex=arr[i].length;
            }

        }
        int[] toplamlarArr=new int[enkucukindex];
        int toplam=0;
        for (int i = 0; i < toplamlarArr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                toplam+=arr[j][i];

                
            }toplamlarArr[i]=toplam;
            toplam=0;
            
        }
        System.out.println(Arrays.toString(toplamlarArr));
    }
}
