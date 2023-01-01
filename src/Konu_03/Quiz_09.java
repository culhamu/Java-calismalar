package Konu_03;

public class Quiz_09 {
    public static void main(String[] args) {
        int input=8;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");
        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");

        }


    }
}
