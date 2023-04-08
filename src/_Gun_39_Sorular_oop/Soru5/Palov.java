package _Gun_39_Sorular_oop.Soru5;

public class Palov implements IFood{
    public void fry(){
        System.out.println("Pirinc ve sehriye kavruldu.");
    }

    public void boil(){
        System.out.println("Kisik ateste pisirildi.");
    }

    @Override
    public void taste() {
        System.out.println("Enfes Palovunuz hazir.Afiyet olsun.");
    }

    @Override
    public double ucret() {
        return 25;
    }
}
