package _Gun_25.soru1;

import java.util.ArrayList;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);

        ArrayList<Ogrenci>snf =new ArrayList<>();//Cok sayida ogrenci olabilecegi icin ogrencileri arrayliste atiyorum

        for (int i = 0; i < 3; i++) {   //3 ogrenciyiy arrayliste for ile ekliyorum

            Ogrenci ogr1 = new Ogrenci();                 //kullanicidan bilgileri aliyoruz
            System.out.println("Ogrenci adi=");
            ogr1.adi = scanStr.nextLine();
            System.out.println("Ogrencinin soyadi=");
            ogr1.soyadi = scanStr.nextLine();
            System.out.println("Ogrencinin sinifi=");
            ogr1.sinifi = scanInt.nextInt();
            System.out.println("Ogrencinin adresi=");
            ogr1.adres = scanStr.nextLine();

            snf.add(ogr1);
        }

        for (   Ogrenci ogr   : snf   ) {             //Kullanicidan alinan ogrenci bilgilerini yazdiriyoruz
            System.out.println(ogr.adi);               //for each metodu kullandik
            System.out.println(ogr.soyadi);
            System.out.println(ogr.sinifi);
            System.out.println(ogr.adres);
        }
    }
}
class Ogrenci {
     String adi;
     String soyadi;
     int  sinifi;
     String adres;



}