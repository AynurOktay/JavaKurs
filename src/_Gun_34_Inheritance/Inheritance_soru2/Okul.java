package _Gun_34_Inheritance.Inheritance_soru2;

public class Okul {
    public static void main(String[] args) {
        // 1- Ogrenci isimli id,isim ve tipi(ENUM ILK,ORTA,LISE)  olan bir class oluşturunuz.
        // 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz, field: brans (String,  MF,TM)
        // 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,  filed: klup  (String SATRANC, TIYATRO ..)
        // 4- Okul isimli mainde 3 adet farklı tipte öğrenci oluşturunuz,
        // 5- Oluşturuken her öğrenciye,kendi sinifinda ayri tanimlanmis sayac ile id no veriniz.

        LiseOgrenci lo=new LiseOgrenci("Aynur Oktay",OkulTipi.LISE,"TM" );
        IlkOgrencisi io=new IlkOgrencisi("Ismet Temur",OkulTipi.ILK,"Satranc");
         OrtaOgrenci oo=new OrtaOgrenci("Ayse Kaya",OkulTipi.ORTA,7);
        System.out.println("lo = " + lo);
        System.out.println("io = " + io);
        System.out.println("oo = " + oo);
    }
}