package Odev_OOP.Soru2;

public class Sum extends Calculator{
    public Sum(int a, int b) {
        super(a, b);
    }

    @Override
    public int calculating(int a, int b) {
        return a+b;
    }




    /*Sum class'ın içinde;
    Calculator class'ına extend et.. (uzat, bağla)
    super class'ın içindeki calculating methodunu Override et.
    iki parametreyi topla ve sonucu return et.*/


}
