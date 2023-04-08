package _Gun_35_Final_Polymorphism.Soru_Polymorphism;

public abstract class OkulInsanlar {
    private String ad;
    private String soyad;
    private String gorevi;
    private String getAd;


    public OkulInsanlar(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }



    @Override
    public String toString() {
        return "OkulInsanlar{" +"ad="+ad +'\''+
                "soyad='" + soyad+
                ", gorevi='" + gorevi + '\'' +
                '}';
    }

    public static void kimlikYaz(OkulInsanlar kisi) {   //bu metodu direk kullanacagim icin metodu static yapiyorum,Static olmazsa main de nesne olusturmadan kullanamam.
        System.out.println("Ad=" + kisi.getAd() +        //static metod class a ait bir metoddur
                "\n" + "Soyad=" + kisi.getSoyad() + "\n" + "Görevi=" + kisi.getGorevi());


    if(kisi instanceof Ogrenci)   //Eger kisi Ogrenci classindan geliyorsa(instanceof ile check ediyoruz) ,kisiye sen ogrecisin diyoruz,oraya aitse subesini ve departmanini ver diyoruz
        System.out.println("Subesi:"+((Ogrenci)kisi).getSubesi());
    else if (kisi instanceof Calisan)
        System.out.println("Departmani:"+((Calisan)kisi).getDepartmani());
}
}
