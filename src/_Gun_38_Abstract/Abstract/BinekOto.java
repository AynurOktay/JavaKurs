package _Gun_38_Abstract.Abstract;

public abstract class BinekOto {


    //bir Interface bir de parent class bi arada ise buna abstract class diyoruz.
    // Interfaceden gelen ici bos metodun basina da abstract yaziyoruz.
     private String marka;
     private int uretimYili;
     private int vitesadedi;

    public BinekOto(String marka, int uretimYili, int vitesadedi) {
        setMarka( marka);
        setUretimYili(uretimYili);
        setVitesadedi (vitesadedi);
    }
    abstract int HizlanmaSuresi();

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesadedi() {
        return vitesadedi;
    }

    public void setVitesadedi(int vitesadedi) {
        this.vitesadedi = vitesadedi;
    }

    @Override
    public String toString() {
        return "BinekOto{" +
                "marka='" + marka + '\'' +
                ", uretimYili=" + uretimYili +
                ", vitesadedi=" + vitesadedi +
                '}';
    }
}
