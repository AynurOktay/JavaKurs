package Mentoring5.Inheritance;

public class Ucak extends ZirhliArac{

    private int fuzeSayisi;
    public Ucak(String name, String fuelType, int range, boolean hasPalette,int fuzeSayisi) {
        super(name, fuelType, range, hasPalette);
        this.fuzeSayisi=fuzeSayisi;
    }

    public int getFuzeSayisi() {
        return fuzeSayisi;
    }

    public void setFuzeSayisi(int fuzeSayisi) {
        this.fuzeSayisi = fuzeSayisi;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "fuzeSayisi=" + fuzeSayisi +
                '}';
    }

    public void attackEnemey(){

        System.out.println(" iskaladin bir daha dene");
    }


}
