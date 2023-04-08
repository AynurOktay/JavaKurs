package _Gun_38_Abstract.Ornek1_;

public class Daire extends Sekil{

   public  double r;

    public Daire(double r) {
        setR(r) ;
    }

    @Override
    double alan() {
        return Math.PI*r*r;
    }

    @Override
    double cevre() {
        return 2*Math.PI*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Daire" +
                "name='" + name + '\'' +"Cevre="+ cevre()
                +"Alan="+alan()
                ;
    }
}
