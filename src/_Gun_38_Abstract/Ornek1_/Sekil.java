package _Gun_38_Abstract.Ornek1_;

public abstract class Sekil {
    String name;

    abstract double alan();

    abstract double cevre();

    public void ciz() {
        System.out.println(name + " isimli sekil cizildi");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' + "Alan=" +
                alan() + '\'' + "Cevre=" + cevre() +
                '}';
    }

}
