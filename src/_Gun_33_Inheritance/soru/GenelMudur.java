package _Gun_33_Inheritance.soru;

public class GenelMudur extends Calisan{
    private double tazminat;
    public GenelMudur(String isim, String soyad, double maas, int maasKatsayisi,double tazminat) {
        super(isim, soyad, maas, maasKatsayisi);
        setTazminat(tazminat);
    }
    public double maasHesapla(){
        return super.maasHesapla()+getTazminat();
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat= tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +"isim="+getIsim()
                +"soyad="+getSoyad()
                +"maas="+getMaas()+
                "maasKatsayisi="+getMaasKatsayisi()+
                "tazminat=" + getTazminat()+
                "Odenecek Maas="+maasHesapla()+
                '}';
    }
}


