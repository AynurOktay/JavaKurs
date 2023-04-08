package Odev_OOP.Soru2;

public class Multiply extends Calculator{
    public Multiply(int a, int b) {
        super(a, b);
    }

    @Override
    public int calculating(int a, int b) {
        return a*b;
    }

/*Multiply class'ının içinde,
    Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
    iki parametreyi çarp ve sonucu return et.*

   */
}
