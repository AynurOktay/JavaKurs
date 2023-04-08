package _Gun_36_Interface._03_Interface;

public class Main {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        ICizdirir c2=new Cember(); //Polymorphism interface de de gecerli
        c2.ciz();

        cizdirme(c);
        cizdirme(d);
    }

    public static void cizdirme(ICizdirir iciz) {
        iciz.ciz();
    }
}
