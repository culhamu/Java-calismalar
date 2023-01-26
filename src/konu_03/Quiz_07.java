package konu_03;

public class Quiz_07 {
    public static void main(String[] args) {
        // verilen input'a gore carpim tablosu olusturun
        // Java'da ic ice yapilara nested denir
        // burada sadece farkli olan i'nin katsayisi oldugundan onun icin de bir loop olusturalim
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");

        }

    }
}
