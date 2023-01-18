package Konu_19;

public class Calisan {
    private String isim;
    private String soyisim;
    private int id;

    public Calisan(String isim, String soyisim, int id) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void bilgilergoster(){
        System.out.println("Çalışan Bilgileri: ");
        System.out.println("İsim : "+isim);
        System.out.println("Soyisim : "+soyisim);
        System.out.println("İd : "+id);
    }
}
