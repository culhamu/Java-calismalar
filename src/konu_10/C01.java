package konu_10;

import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {
        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        // eski array’e yeni degeri atayin.
        String[] isimler={"Ali","Veli","Cem"};
        String eklenecekIsim="Kemal";
        isimler=arrayeIsimEKleme(isimler,eklenecekIsim);
        System.out.println(Arrays.toString(isimler));





    }public static String [] arrayeIsimEKleme(String[]eklenilecekarr,String eklenecekIsim){

        String [] temp=new String[eklenilecekarr.length+1];

        for (int i = 0; i < eklenilecekarr.length; i++) {
            temp[i]=eklenilecekarr[i];

        }temp[temp.length-1]=eklenecekIsim;
        return temp;

    }

}
