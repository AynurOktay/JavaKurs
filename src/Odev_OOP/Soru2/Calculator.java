package Odev_OOP.Soru2;

public  abstract class Calculator {

    /*super class'ın içinde;
    calculating adında bir abstract method oluturunuz.
    Burada iki tane int parametresi vardır.
        return tipi int'dir.  */

    int a;
    int b;

    public abstract int calculating(int a,int b);

    public Calculator(int a, int b) {
        setA(a);
        setB(b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

