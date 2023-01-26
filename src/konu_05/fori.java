package konu_05;

public class fori {
    public static void main(String[] args) {
        String str="Anadolu";
        int i=0;

        System.out.println("Karakter "+"     "+"İndex");
        for (int j = 0; j <=str.length()-1; j++) {
            System.out.println(str.charAt(j)+"               "+j);

        }
    }
}
