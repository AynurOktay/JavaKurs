package _Gun_39_Sorular_oop.Soru5;

public class Borsch implements IFood {

    public void boil(){
        System.out.println("Corbaniz kisik ateste kaynatildi.");
    }
    public void eatTomorrow(){
        System.out.println("Lutfen corbanizi bir gun dinlendirip servis ediniz.");
    }

    @Override
    public void taste() {
        System.out.println("Enfes Borsch corbasi.Afiyet olsun.");
    }

    @Override
    public double ucret() {
        return 40;
    }
}
