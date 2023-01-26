package konu_03;

public class Quiz_08 {
    public static void main(String[] args) {
        // input olarak verilen kenar uzunluklarina gore
        // asagidaki sekli cizdirin
        int kisaKenar=6;
        int uzunKenar=9;
        /*
                * * * * * * * *   // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
             Satirda yaptigimiz islemi kac kere tekrar edecegimizi ise outer loop belirliyor

         */
        for (int i = 1; i <=6; i++) {//outer loop satır ı kontrol eder
            for (int j = 1; j <=9 ; j++) {//inner loop sütünu kontrol eder
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
