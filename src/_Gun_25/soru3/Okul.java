package _Gun_25.soru3;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

      Scanner scanStr=new Scanner(System.in);
       Scanner scanInt=new Scanner(System.in);

        ArrayList<Ogrenci>snf=new ArrayList<>();

        for (int i = 0; i <20 ; i++) {

            Ogrenci ogr=new Ogrenci();

            System.out.println("Okul no:");ogr.okulNo=scanInt.nextInt();
            System.out.println("Adi soyadi:");ogr.AdiSoyadi= scanStr.nextLine();
            System.out.println("Not:");ogr.notu= scanInt.nextInt();

            snf.add(ogr);
        }

        bilgileriYazdir(snf);  //sadece yazdir dedigi icin return kullanmiyoruz
        ortalamaYaz(snf);

    }
       public static void bilgileriYazdir  ( ArrayList<Ogrenci> snf)    {
           for (Ogrenci ogr: snf) {
               System.out.println("ogr = " + ogr.okulNo);
               System.out.println("ogr = " + ogr.AdiSoyadi);
               System.out.println("ogr = " + ogr.notu);
           }

       }
     public static void  ortalamaYaz( ArrayList<Ogrenci>snf) {
         int toplam=0;
         for (Ogrenci ogr: snf) {
             toplam+=ogr.notu;}
             System.out.println("Ortalama="+toplam/snf.size());



         }

}
