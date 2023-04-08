package _Gun_38_Abstract.Ornek1_;

public class Dikdortgen extends Sekil{

    private double kenar1;
    private double kenar2;

    public Dikdortgen(double kenar1, double kenar2) {
        setKenar1 (kenar1);
        setKenar2 (kenar2);
    }

    @Override
    double alan() {
        return this.kenar1*this.kenar2;
    }

    @Override
    double cevre( ) {
        return 2*(this.kenar1+this.kenar2);
    }

    public double getKenar1() {
        return kenar1;
    }

    public void setKenar1(double kenar1) {
        this.kenar1 = kenar1;
    }

    public double getKenar2() {
        return kenar2;
    }

    public void setKenar2(double kenar2) {
        this.kenar2 = kenar2;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "name='" + name + '\'' +
                '}';
    }


}
