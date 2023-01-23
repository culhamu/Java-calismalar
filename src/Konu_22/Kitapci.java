package Konu_22;

import java.util.Map;

public class Kitapci<M> {
    private int kitapNo=1000;
    private String kitapAdi;
    private String yazarAdi ;
    private double fiyati ;

    public Kitapci() {
    }

    public Kitapci(int kitapNo, String kitapAdi, String yazarAdi, double fiyati) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.fiyati = fiyati;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public double getFiyati() {
        return fiyati;
    }

    public void setFiyati(double fiyati) {
        this.fiyati = fiyati;
    }

    @Override
    public String toString() {
        return "Su Yolcu Kitabevi'ne Hoşgeldiniz"+
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi +
                ", yazarAdi='" + yazarAdi +
                ", fiyati=" + fiyati ;
    }
}
