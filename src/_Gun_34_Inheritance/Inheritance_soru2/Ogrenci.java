package _Gun_34_Inheritance.Inheritance_soru2;

public class Ogrenci {
   private final int id ;
    private String isim;
    private OkulTipi tipi;  //okul tipinin tipi enum oldugundan OKULTIPI yaziyoruz



    public Ogrenci(String isim, OkulTipi tipi, int id) {

        SetIsim(isim);
        SetTipi(tipi);
        this.id=id;
    }

    private void SetTipi(OkulTipi tipi) {
    }

    private void SetIsim(String isim) {
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim)
    {
        if(isim.length() >20)   //bu sekilde
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public OkulTipi getTipi() {
        return tipi;
    }

    public void setTipi(OkulTipi tipi) {
        this.tipi = tipi;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +"id="+id+
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}
