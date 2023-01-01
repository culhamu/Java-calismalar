package Konu_07;

import java.io.FilterOutputStream;

public class doWhile2 {
    public static void main(String[] args) {
        /*
        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A
        A A A A A
        A A A A A
         */
        int rows = 3;
        int columns = 5;
        int i=1;
        do{
            String s = "";
            for(int k=1; k<=columns; k++){
                s = s + "A ";
            }
            System.out.println(s);
            i++;
        }while(i<=rows);

    }
}
