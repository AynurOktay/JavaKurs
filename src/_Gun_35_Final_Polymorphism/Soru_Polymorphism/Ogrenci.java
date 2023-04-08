package _Gun_35_Final_Polymorphism.Soru_Polymorphism;

public class Ogrenci extends OkulInsanlar{
    private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi,String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void  setSubesi(String subesi) {
        this.subesi= subesi;}

    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi='" + subesi + '\'' +
                super.toString();
    }
}



