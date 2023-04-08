package _Gun_35_Final_Polymorphism.Soru_Polymorphism;

public class MainOkul {
    public static void main(String[] args) {
      /*  1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
        2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
        3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
        olacak kimlik belgesi formu oluşturan tek bir metod yazınız.
         */


   Ogrenci ogr1=new Ogrenci("Aynur","Oktay","ogrenci","8");
   Calisan cal1=new Calisan("Cem","Oktay","ogretmen","10");

    OkulInsanlar.kimlikYaz(ogr1);
    OkulInsanlar.kimlikYaz(cal1);



    }

}
