package _Gun_32_Encapsulations._02_Soru;

public class Ogrenci {

    private String ad;
    private String soyad;
    private int yas;
    private int id;
    static int idSayac=1;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, int yas, int id) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
        setId(idSayac++);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;}

    public int getId() {return id ;}

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdSayac() {
        return idSayac;
    }

    public static void setIdSayac(int idSayac) {
        Ogrenci.idSayac = idSayac;
    }


            @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
