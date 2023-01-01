package Konu_16;

import java.util.Scanner;

public class forEach4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
         String cumle=scan.nextLine();
        System.out.println("aramak istediğiniz harfi giriniz");
        char harf=scan.next().charAt(0);
        int count=0;

        for (char each:cumle.toCharArray()) {
            if (each==harf){
                count++;
            }

        }if (count==0){
            System.out.println("cümlede harf hiç kullanılmamıştır");
        }else System.out.println("cümlede  "+harf +" "+count +" defa kullanılmıştır");
    }
}
