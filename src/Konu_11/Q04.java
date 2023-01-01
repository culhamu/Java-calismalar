package Konu_11;

public class Q04 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */
        String str="Java candir";
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }
        System.out.println(tersStr);
    }
}
