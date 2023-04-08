package _Gun_34_Inheritance.Inheritance_soru2;

public class OrtaOgrenci extends Ogrenci{

    private int sinif;
  private static int ortaIdSayac=1;
    public OrtaOgrenci(String isim, OkulTipi tipi, int sinif) {
        super(isim, tipi, ortaIdSayac++);
        SetSinif(sinif);
    }

    private void SetSinif(int sinif) {
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "OrtaOgrenci{" +
                "sinif=" + sinif +super.toString()
                ;
    }
}
