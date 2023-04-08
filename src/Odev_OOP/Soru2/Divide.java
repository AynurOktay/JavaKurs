package Odev_OOP.Soru2;

public class Divide extends Calculator{


    public Divide(int a, int b) {
        super(a, b);
    }

    @Override
    public int calculating(int a, int b) {
        return a/b;
    }
}
