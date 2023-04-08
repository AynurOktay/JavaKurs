package _Gun_39_Sorular_oop.Soru1;

public class Kedi extends Hayvan{
    public Kedi( String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }



    @Override
    void yiyecegi() {
        System.out.println("mama ");
    }

    @Override
    void yemekMiktari() {
        System.out.println("gunde 300 gr");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("16 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }



}
