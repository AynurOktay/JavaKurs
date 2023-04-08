package _Gun_39_Sorular_oop.Soru1;

public class Kartal extends Hayvan{
    public Kartal( String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("et ");
    }

    @Override
    void yemekMiktari() {
        System.out.println("gunluk 500 gr.");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("10 saat uyur");
    }

    @Override
    void sesi() {
        System.out.println("viyak viyak ");
    }
}
