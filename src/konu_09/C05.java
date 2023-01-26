package konu_09;

public class C05 {
    public static void main(String[] args) {
       /* Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        işaretiyle yazdırmak için gereken kodu yazınız.
        Örneğin; 75.4238 ´ *4*2*3*8
       */
       double dbl=75.4238;
       String str=String.valueOf(dbl);
        str=str.substring(3);
        String r="";
        for (int i = 0; i <=str.length()-1 ; i++) {
        String t=str.substring(i,i+1);
            r=r+t+"*";


        }System.out.print(r);

    }
}
