package Konu_05;

public class Sembol {
    public static void main(String[] args) {
        String sifre = "1a23b4es";
        Boolean enAzSekizKrkMi= sifre.replaceAll("\\s","").length()>=8;
        Boolean enAzBirSembolVarMi = sifre.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println("sifre gecerli mi ? " + (enAzSekizKrkMi && enAzBirSembolVarMi));
    }
}
