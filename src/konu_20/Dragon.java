package konu_20;

public class Dragon extends Beyblade{
    //burda kai nin beyblade ne kutsal canavar ve gizli yetenek ekleyelim ekstra dan
    private String kutsalCanavar;
    private String gizliYetenek;
    //daha sonra beyblade özelliklerini alabilmek için extends ediyoruz
    //ve ekstra kutsal canavar özelliğini constructor a ekliyoruz
    public Dragon(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
        this.gizliYetenek=gizliYetenek;
    }
    //beyblade class ındaki methodlardan ortak olmayan yani overriding yapabilecegimiz
    //kutsal canavar ve bilgileri göster method unu overriding yapıyoruz
    @Override
    public void kutsalCanavarOrtayaCikar() {
        //super class daki kutsal canavarı kullanmamak için
        //buraya beybladeci adı ile canavarının adını giriyoruz
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci()+" in gizli saldırısı: Hayalet Kasırga");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        //buraya ekstradan kutsal canavar adı ekleyelim
        System.out.println("Kutsal canavar adı : "+kutsalCanavar);
        System.out.println("Gizli yetenek : "+gizliYetenek);
    }
}
