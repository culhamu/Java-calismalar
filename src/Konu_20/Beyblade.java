package Konu_20;

public class Beyblade {
    //Beyblade deki bütün ortak özellikleri buraya giriyoruz
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;
    //Constructor ve getter-setter methodlarımızı ekliyoruz

    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    //ortak olan bir method'umuz olacak
    public void saldiri(){
        System.out.println(getBeybladeci()+" "+saldiriGucu+" ve "+donusHizi+" ile saldırıyor...");
    }
    //daha sonra bir method daha yazıyoruz
    public void kutsalCanavarOrtayaCikar(){
        //bizim herhangibir kutsal canavar özelliğimiz olmadığı için bütün beyblade'lerde kutsal
        //canavar olmadığı için
        System.out.println("Bu beyblade'nin kutsal canavarı bulunmuyor...");
    }
    //daha sonra burdaki bilgileri göstermek için
    public void bilgileriGoster(){
        System.out.println("beybladeci ismi : "+beybladeci);
        System.out.println("saldiri gücü : "+saldiriGucu);
        System.out.println("dönüş hızı : "+donusHizi);
        //burdan 4 tane beyblade üreteceğiz (ana karakterler kai,rai,max ve takao)
    }
}
