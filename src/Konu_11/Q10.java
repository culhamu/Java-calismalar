package Konu_11;

public class Q10 {
    public static void main(String[] args) {
       Q09.fibonacciYazdir(5);

      String str="ey edip adanada pide ye";
        String tersStr=Q06.tersStr(str);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("palindrome");
        }else System.out.println("palindrome değil");

    }
}
