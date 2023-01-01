package Konu_07;

public class TekrarsizDoWhile {
    public static void main(String[] args) {
         /*
        Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        Örnek; 223878 ´ 37
         */
        int num = 223878;
        String s = String.valueOf(num);
        String d = "";
        int i = 0;
        do{
            String c = s.substring(i,i+1);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                d += c;
            }
            i++;
        }while(i<s.length());
        System.out.println(d);
    }
}
