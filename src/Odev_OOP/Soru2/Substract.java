package Odev_OOP.Soru2;

public class Substract extends Calculator{
    public Substract(int a, int b) {
        super(a, b);
    }

    @Override
    public int calculating(int a, int b) {
        return a-b;
    }

   /* Substract class'ının içinde,
    Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
    iki parametreyi birbirinden çıkart ve sonucu return et.*/


}
