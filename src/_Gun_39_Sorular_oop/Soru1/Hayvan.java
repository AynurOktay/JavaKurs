package _Gun_39_Sorular_oop.Soru1;

public abstract class Hayvan {

     private final int id;

    private static  int counter=1;
     private String isim;
     private boolean vahsi;
     private String dogumTarihi;

     abstract void yiyecegi();
     abstract void yemekMiktari();
     abstract void gunlukUykuSuresi();
     abstract void sesi();

    public Hayvan( String isim, boolean vahsi, String dogumTarihi) {
        this.id=counter++;
        setIsim ( isim);
        setVahsi (vahsi);
        setDogumTarihi (dogumTarihi);
    }

    public int getId() {
        return id;
    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("Yiyecegi="); yiyecegi();
        System.out.print("Yemek miktari="); yemekMiktari();
        System.out.print("Uyku süresi="); gunlukUykuSuresi();
        System.out.print("Sesi="); sesi();

        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
