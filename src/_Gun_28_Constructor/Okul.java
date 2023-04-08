package _Gun_28_Constructor;

public class Okul {
    public static void main(String[] args) {

        //1.yol

        Ogrenci ogr1=new Ogrenci();
        ogr1.id=1;
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinifi=5;
        System.out.println("ogr1 = " + ogr1);

        //".yol
        Ogrenci ogr2=new Ogrenci(2,"mehmet","yilmaz",5);
        System.out.println("ogr2 = " + ogr2);

        //3.yol
        Ogrenci ogr3=new Ogrenci (2,"ayse","bayrak");


    }

}
