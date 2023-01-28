package konu_24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Treemap kullanarak bir Stringin içindeki harflerin frekansını bulma

        Scanner scan=new Scanner(System.in);
        System.out.print("Cümleyi giriniz : ");
        String cumle=scan.nextLine();
        Map<Character,Integer> frekans=new TreeMap<>();

        for (int i = 0; i < cumle.length(); i++) {

            char c=cumle.charAt(i);

            if (frekans.containsKey(c)){

                frekans.replace(c,frekans.get(c)+1);
            }else {
                frekans.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> entryMap: frekans.entrySet()) {

            System.out.println("Karakter : "+entryMap.getKey()+" "+entryMap.getValue()+" kadar geçiyor...");
        }
    }
}
