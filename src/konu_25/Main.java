package konu_25;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Main {
    public static  void main(String[] args) {

        Vector<String> vec=new Vector<>();
        vec.add("Java");
        vec.add("Phyton");
        vec.add("Phyton");
        vec.add("Php");
        System.out.println(vec);
        System.out.println("*************************************");
        ListIterator<String> iterator= vec.listIterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

        System.out.println("************************************");
        Enumeration<String> enumeration=vec.elements();

        while (enumeration.hasMoreElements()){

            System.out.println(enumeration.nextElement());
        }
        System.out.println("*****************************");
        System.out.println("İlk eleman : "+vec.firstElement());
        System.out.println("Son eleman : "+vec.lastElement());
    }
}
