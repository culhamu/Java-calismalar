package konu_08;

public class C03 {
    public static void main(String[] args) {
        /*
          // kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakteri yazdirin
         */
        char input='a';

        for (int i = 0; i <=10; i++) {
            System.out.print((char) (input+i)+" ");

        }
    }
}
