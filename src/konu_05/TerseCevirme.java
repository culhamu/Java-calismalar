package konu_05;

public class TerseCevirme {
    public static void main(String[] args) {
        String str="Java öğrenmek için çok çalışmak lazım";
        String tersStr="";

        for (int i = str.length()-1; i>=0 ; i--) {

            tersStr+=str.substring(i,i+1);



        }
        System.out.println(tersStr);

    }
}
