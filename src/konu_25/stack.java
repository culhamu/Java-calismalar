package konu_25;
import java.util.*;
public class stack {
    public static void main(String[] args) {

       Stack<String> stack=new Stack<>();

       stack.push("Java");
       stack.push("Python");
       stack.push("Php");
       stack.push("Go");

        for (String s:stack) {
            System.out.println(s);
        }

        System.out.println("***********************************");
        Enumeration<String> enumeration=stack.elements();

        while (enumeration.hasMoreElements()){

            System.out.println(enumeration.nextElement());
        }
        System.out.println("************************************");

        ListIterator<String> listIterator= stack.listIterator();

        while (listIterator.hasNext()){

            System.out.println(listIterator.next());
        }
        System.out.println("***********************************");

       /* System.out.println("Son giren eleman çıkarılıyor : "+stack.pop()+"\n");

        for (String s:stack) {
            System.out.println(s);
        }*/

        while (!stack.empty()){
            System.out.println("Eleman çıkarılıyor :  "+stack.pop());
        }
        System.out.println(stack.empty());
    }
}
