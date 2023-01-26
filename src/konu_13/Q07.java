package konu_13;

import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {
        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        // eski array’e yeni degeri atayin.
        String[] arr={"Ali","Veli","Cem"};
        String eklenecekArr="Kemal";
        arr=arrayeElementEkleme(arr,eklenecekArr);
        System.out.println(Arrays.toString(arr));
    }public static String[] arrayeElementEkleme(String [] arr,String eklenecekArr){
        String[] yeniArr=new String[arr.length+1];
        for (int i = 0; i < arr.length; i++) {

            yeniArr[i]=arr[i];

        }yeniArr[yeniArr.length-1]=eklenecekArr;
        return yeniArr;


    }
}
