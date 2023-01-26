package konu_22;

public class Kitapci<M> {

    private String kitapAdi;
    private String yazarAdi ;
    private double fiyati ;

    public Kitapci() {
    }

    public Kitapci( String kitapAdi, String yazarAdi, double fiyati) {

        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.fiyati = fiyati;
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
        return "kitapAdi=" + kitapAdi +"\n"+
                "yazarAdi=" + yazarAdi +"\n"+
                "fiyati=" + fiyati ;
    }
}
