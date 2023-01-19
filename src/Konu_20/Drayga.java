package Konu_20;

public class Drayga extends Beyblade{
    //burda bir beyblade daha oluşturuyoruz
    //yine buraya ek özellik olarak kai deki gibi kutsal canavar ı ekliyoruz
    private String kutsalCanavar;
    public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }
    //yine aynı şekilde method ları override ediyoruz


    @Override
    public void kutsalCanavarOrtayaCikar() {
        //super class daki kutsal canavarı kullanmamak için
        //buraya beybladeci adı ile canavarının adını giriyoruz
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci()+" in gizli saldırısı: Kapşan Pençesi");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        //buraya ekstradan kutsal canavar adı ekleyelim
        System.out.println("Kutsal canavar adı : "+kutsalCanavar);
    }
}
