package konu_16;

import java.util.ArrayList;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

         */
        Integer [] arr ={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> yeniList=new ArrayList<>();


        for (Integer each:arr) {
           if (!yeniList.contains(each)){
               yeniList.add(each);
           }

        }
        System.out.println(yeniList);
    }
}
