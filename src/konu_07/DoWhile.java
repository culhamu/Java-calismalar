package konu_07;

public class DoWhile {
    public static void main(String[] args) {

        String str="ali baba";
        char krk='a';
        int counter=0;
        int baslangic=str.length()-1;

        do {
            if (str.charAt(baslangic)==krk){
                counter++;
            }baslangic--;

        }while (baslangic>=0);
        System.out.println(counter);
    }
}
