package _Gun_34_Inheritance.Inheritance_soru2;

public class IlkOgrencisi extends Ogrenci {
    private static int ilkIdSayac ;
    private String klup;

    public IlkOgrencisi(String isim, OkulTipi tipi, String klup) {
        super(isim, tipi, ilkIdSayac++);
        SetKlup(klup);
    }

    private void SetKlup(String klup) {
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return "IlkOgrencisi{" +
                "klup='" + klup + '\'' +super.toString()
                ;
    }
}
