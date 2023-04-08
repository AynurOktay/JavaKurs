package _Gun_34_Inheritance.Inheritance_soru2;

public class LiseOgrenci extends Ogrenci{
    private static int liseIdSayac = 1;
    private OkulTipi tipi;
   private  String brans;


    public LiseOgrenci(String isim, OkulTipi tipi, String brans) {
        super(isim, tipi,liseIdSayac++);
        SetBrans(brans);
    }

    private void SetBrans(String brans) {
    }


    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "LiseOgrenci{" +
                "brans='" + brans + '\'' +super.toString()
                ;
    }
}

