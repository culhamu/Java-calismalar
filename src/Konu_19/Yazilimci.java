package Konu_19;

public class Yazilimci extends Calisan {
    private String diller;
    public Yazilimci(String isim, String soyisim, int id,String diller) {
        super(isim, soyisim, id);
        this.diller=diller;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getIsim()+" "+isletim_sistemi+" 'ni yüklüyor");
    }

    @Override
    public void bilgilergoster() {
        super.bilgilergoster();
        System.out.println("Yazılımcıların bildiği diller : "+diller);
    }
}
