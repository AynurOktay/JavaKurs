package _Gun_30_Final_StaticVariables.StaticVariables.Ornek1;

public class OKUL {
    public static void main(String[] args) {

       // Ogrenci ogr1 =new Ogrenci("Ismet","Temur","Yildirim Ilkokulu");
       // Ogrenci ogr2=new Ogrenci("Aynur","Oktay","Yildirim Ilkokulu");
   //ogrenciler icin okul adi ortak oldugundan classtaki okul adini static yapiyorum.sadece classa ait olmamis oluyor

        //ortak olan okul adini tanimlarken eklemeyip cikariyorum,cunku hepsine ayni

        Ogrenci ogr1=new Ogrenci("Ismet","Temur");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAdi="Ataturk Ilkokulu";
        System.out.println("ogr1 tekrar = " + ogr1);

   Ogrenci ogr2 =new Ogrenci("Ali","Yildirim");
        System.out.println("ogr2 = " + ogr2);


    }
}
