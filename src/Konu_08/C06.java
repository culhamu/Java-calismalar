package Konu_08;

public class C06 {
    public static void main(String[] args) {
        /*

        public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
        int input1=12;
        int input2=25;
        int toplam=0;
        for (int i = input1; i <=input2 ; i++) {
            toplam+=i;
            if (input1>input2){
                System.out.println("Uyarı");
                break;
            }
        }System.out.println(toplam);
    }
}
