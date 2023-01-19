package Konu_20;

public class BeybladeUret {
    //burda beyblade üretmek istediğimizde kullanacağımız class oluşturuyoruz
    //ve referansını beyblade calssından oluşturuyoruz
    public Beyblade beybladeUret(String beybladeTuru){
        //polymorphism de dranza,drayga,dragon ya da draciel in bir tane referansını beyblade ye
        //atayabiliyorduk hiçbir sıkıntı olmadan beyblade miz gidecek ve başka bir beybladeye eşitlenmiş olacak
        //burda beyblade üretmek için bir if bloğu açıyoruz
        if (beybladeTuru.equals("Dragon")){
            return new Dragon("Takao",800,300,"Mavi ejderha","Kutsal Canavarla Konuşma");
        } else if (beybladeTuru.equals("Dranza")) {
            return new Dranza("Kai",600,500,"Kırmızı Anka Kuşu");
        } else if (beybladeTuru.equals("Drayga")) {
            return new Drayga("Rai",800,250,"Beyaz Kaplan");
        } else if (beybladeTuru.equals("Draciel")) {
            return new Draciel("Max",400,1000,"Kara Kaplumbağa");
        }
        else return null;
    }
}
