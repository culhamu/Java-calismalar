package Konu_16;

import java.util.ArrayList;
import java.util.Arrays;

public class forEach5 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        ayri bir liste olarak veren bir program yazin.
         */
        int[] arr1={1,2,3,4,6,5,98,8,7};
        int[] arr2={1,2,3,4,5,4,6,8,9,8};

        ArrayList<Integer> list=new ArrayList<>();

        for (Integer each:arr1) {
            for (Integer w:arr2) {
                if (each.equals(w)){
                    if (!list.contains(each))
                        list.add(each);

                }
            }

        }
        System.out.println(list);
    }
}
