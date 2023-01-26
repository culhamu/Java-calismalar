package konu_05;

public class forLoop {
    public static void main(String[] args) {
         //input olarak verilen bir stringde indexi çift olanları büyük harfle
        // indexi tek olanları küçük harfle yazdırın
        String input="Java candır selenium heyecan";

        for (int i = 0; i <input.length(); i++) {
            if (i%2==0){
                System.out.print(input.substring(i, i + 1).toUpperCase());
            }else System.out.print(input.substring(i, i + 1).toLowerCase());


        }




    }
}
