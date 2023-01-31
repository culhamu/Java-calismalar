package konu_25;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        //Bir cümlenin palindrome olup olmadığını bulma

        //kasaylabalyasak
        Scanner scan=new Scanner(System.in);
        System.out.println("Cümleyi giriniz...");
        String cumle=scan.nextLine();

        Stack<Character> stack=new Stack<>();

        for (int i = 0; i <cumle.length()/2 ; i++) {

            stack.push(cumle.charAt(i));
            
        }

        if (isPalindrome(cumle,stack)){
            System.out.println("Bu cümle palindrome dur...");
        }else System.out.println("Bu cümle palindrome değildir...");
    }

    private static boolean isPalindrome(String cumle,Stack<Character> stack) {
        for (int i = (cumle.length()/2)+1; i <cumle.length() ; i++) {

            if (cumle.charAt(i)!=stack.pop()){
                return false;
            }
        }return true;
    }
}
