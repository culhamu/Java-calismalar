package Konu_07;

public class Loop {
    public static void main(String[] args) {
        /*
        120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        ardışık tam sayı arasında boşluk bırakarak yazınız.
         */
        for (int i = 11; i <=120; i++) {
            if (i%4==0&&i%6==0){
                System.out.print(i+" ");
            }

        }
    }
}
