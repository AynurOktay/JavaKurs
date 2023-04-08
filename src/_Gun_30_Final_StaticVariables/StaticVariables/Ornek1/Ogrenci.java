package _Gun_30_Final_StaticVariables.StaticVariables.Ornek1;

public class Ogrenci {

String ad;
String soyad;
static String okulAdi;  //static olunca bundan bir classta sadece bir tane oluyor,hepsi icin kullanilabiliyor(sen bir tanesin diyoruz ona)
     //tekrarlana tum nesneler icin kullanilacak.Hepsine atanir
    //static varsa hafizadan tasarruf saglar

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                "Okul adi="+okulAdi+'\'' ;
    }

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;



    }
}
