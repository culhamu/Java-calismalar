package Konu_20;

public class Draciel extends Beyblade{
    //burda kai nin beyblade ne kutsal canavar gücü ekleyelim ekstra dan
    private String kutsalCanavar;
    //daha sonra beyblade özelliklerini alabilmek için extends ediyoruz
    //ve ekstra kutsal canavar özelliğini constructor a ekliyoruz
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        //super class daki kutsal canavarı kullanmamak için
        //buraya beybladeci adı ile canavarının adını giriyoruz
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci()+" in savunması: Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        //buraya ekstradan kutsal canavar adı ekleyelim
        System.out.println("Kutsal canavar adı : "+kutsalCanavar);
    }
}
