package konu_07;

public class palindrome {
    public static void main(String[] args) {
        /*
        Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
         */
        String str="ey edip adanada pide ye";
        String tersStr="";
        int kosul=str.length()-1;
        do {
            String yeni=str.substring(kosul,kosul+1);
            tersStr+=yeni;
            kosul--;

        }while (kosul>=0);
        if (tersStr.equals(str)){
            System.out.println(" palindrome ");
        }else System.out.println("Palindrome değildir");

    }
}
