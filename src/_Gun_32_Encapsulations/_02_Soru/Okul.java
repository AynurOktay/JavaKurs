package _Gun_32_Encapsulations._02_Soru;

import java.util.ArrayList;

public class Okul {
    private static String okulAd;
    private static int kontenjan;
    private static ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

    public Okul() {
    }

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
    }
    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }




    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogrenciler=" + ogrenciler +
                '}';

    }


}
