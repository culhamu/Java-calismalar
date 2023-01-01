package Konu_06;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
           /*
        Soru 17-)
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        Örnek:
        char ch1=            'a'
        String name =     "Ali bakkala geç gitti."
        Beklenen Çıktı=    a sayısı = 3
        Ipucu:
        Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini
        Loop içindeki İf ile bulabilirsiniz!
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir isim ve karakter giriniz");
        String isim=scan.nextLine();
        char krk=scan.next().charAt(0);
        int tekrar=0;
        for (int i = 0; i <isim.length() ; i++) {
            if (isim.charAt(i)==krk){
                tekrar++;
            }


        }System.out.println(isim+ " de "+krk+ " " +tekrar+ " tane vardır");
    }
}
