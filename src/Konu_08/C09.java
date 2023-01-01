package Konu_08;

public class C09 {
    public static void main(String[] args) {
        /*
        public static void main(String[] args) {
        // verilen input'a gore carpim tablosu olusturun
        // Java'da ic ice yapilara nested denir
        // burada sadece farkli olan i'nin katsayisi oldugundan onun icin de bir loop olusturalim
         */
        int carpim=1;
        for (int i = 1; i <=4 ; i++) {
            for (int j = i; j >=1 ; j--) {
                carpim=i*j;
                System.out.print(carpim+ " ");

            }
            System.out.println("");
        }


    }
}
