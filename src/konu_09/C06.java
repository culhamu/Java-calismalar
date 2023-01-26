package konu_09;

public class C06 {
    public static void main(String[] args) {
        double dbl=75.4238;
        String str=String.valueOf(dbl);
        str=str.substring(3);
        String r="";
        int i=0;
        do {
            String t=str.substring(i,i+1);
            r=r+t+"*";
            i++;

        }while (i<=str.length()-1);
        System.out.println(r);
    }
}
