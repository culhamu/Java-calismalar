package konu_02;

public class Quiz_02 {
    public static void main(String[] args) {
        /*
         // bu metindeki sayilardan kurtulun

         */
        String str= "J6a1va 566G1uz6,z1e6l-d61ir1";
        str=str.replaceAll("\\s","");
       str=str.replaceAll("\\W","");
       str=str.replaceAll("\\d","");
        System.out.println(str);

        // eger tum a'lari degil de sadece ilk a'yi degistirmek isterseniz
        String str1= "Java heyecandir";
        System.out.println(str1.replaceFirst("a","A"));

    }
}
