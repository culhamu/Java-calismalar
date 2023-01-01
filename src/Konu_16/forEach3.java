package Konu_16;

import java.util.ArrayList;
import java.util.List;

public class forEach3 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        - Kelimenin uzunlugu cift sayi ise ilk yarisini
        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        yeni bir listeye ekleyip yazdirin.
         */
        String[] arr={"Java candir selenium vardır heyecan"};
        int uzunluk= arr[0].lastIndexOf("");
        List<String> yeniList=new ArrayList<>();
        for (String each:arr) {

            if (uzunluk%2==0){

                yeniList.add(arr[0].substring(0,arr[0].length()/2));

            }else {

                yeniList.add(arr[0].substring(arr[0].length()/2));
            }

        }
        System.out.println(yeniList);



    }
}
