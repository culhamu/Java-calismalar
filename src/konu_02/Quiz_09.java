package konu_02;

public class Quiz_09 {
    public static void main(String[] args) {
        // verilen sayinin faktoryelini hesaplayin
        // 5! = 5*4*3*2*1
        int carpim=1;
        for (int i = 1; i <=5 ; i++) {

            carpim*=i;
        }
        System.out.println(carpim);
    }
}
