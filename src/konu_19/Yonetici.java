package konu_19;

public class Yonetici extends Calisan {
    private int sorumluKisiSayisi;
    public Yonetici(String isim, String soyisim, int id,int sorumluKisiSayisi) {
        super(isim, soyisim, id);
        this.sorumluKisiSayisi=sorumluKisiSayisi;
    }

    @Override
    public void bilgilergoster() {
        super.bilgilergoster();
        System.out.println("Yöneticinin sorumlu olsuğu kişi sayısı : "+sorumluKisiSayisi);
    }
    public void zamYap(int zamMiktari){
        System.out.println("Yönetici çalısanlara "+zamMiktari+" kadar zam yaptı.");
    }
}
