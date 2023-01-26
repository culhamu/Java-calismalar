package konu_02;

public class Quiz_01 {
    public static void main(String[] args) {
        /*
        asagidaki arama sonucunun 10 binden fazla oldugunu test edin

         */
        String sonuc= "1-16 of over 100,000 results for \"apple\"";

        int baslangic=sonuc.indexOf("over");
        int bitis=sonuc.indexOf("results");

        String str=sonuc.substring(baslangic+5,bitis-1);
        str=str.replace(",","");
        int intSonuc=Integer.parseInt(str);
        if (intSonuc>10000){
            System.out.println("test sonucu passed");

        }else System.out.println("test sonucu failed");

        }


    }

