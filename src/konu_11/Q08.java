package konu_11;

public class Q08 {
    public static void main(String[] args) {
        faktoryelyazdir(7);
    }public static void faktoryelyazdir(int i) {
        int carpim = 1;
        for (int j = 1; j <= i; j++) {
            carpim *= j;
        }
        System.out.println(i + "! = " + carpim);
    }
}
