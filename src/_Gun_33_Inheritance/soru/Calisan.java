package _Gun_33_Inheritance.soru;

public class Calisan {

    private String isim;
    private String soyad;
    private double maas;
    private int maasKatsayisi;


    public Calisan(String isim, String soyad, double maas, int maasKatsayisi) {
        setIsim(isim);
        setSoyad(soyad);
        setMaas(maas);
        setMaasKatsayisi(maasKatsayisi);
    }

    public double maasHesapla(){
        return maas*maasKatsayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }


    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }


    public int getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(int maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }


    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", soyad='" + soyad + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                "Odenecek maas="+maasHesapla()+
                '}';
    }
}
