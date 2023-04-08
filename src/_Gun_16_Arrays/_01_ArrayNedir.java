package _Gun_16_Arrays;

import java.util.Scanner;

public class _01_ArrayNedir {
    public static void main(String[] args) {

        //bana bir tanimlamada BIRDEN FAZLA deger tutabilen bir degiskene ihtiyacim var;
        //Cözüm:
        int[] notlar = new int[50];  //50 tane int saklayabilen notlar isismli degisken

        notlar[0] = 75;  //0.indexteki deger
        notlar[1]  =88;
         //.....
        //....
        notlar[49] = 95;//en son eleman sayisi  length -1 dir böylece 0_49 indextir.
                        //49.index 50.ögrencinin notudur

        System.out.println("notlar[0]" +notlar[0]); //0.indexteki notu bu sekilde yazdiriyoruz


        System.out.println("notlar.length=" +notlar.length); // toplam eleman sayisini verir.yani 50 yazdirir.

        //Dizi nasil okutulur:

        Scanner scan=new Scanner(System.in);
        for (int i=0 ;i<notlar.length ;i++){    //döngünün sonuna notlar.length yazdigimizda en son degerin indexini(50yi) verir

            System.out.print("Notlar giriniz=");  //döngüyle hafizadakileri tek tek okumasi icin notlar[i] yi yazdiririz.
            notlar[i]=scan.nextInt();}

            for (int i=0 ;i<notlar.length ;i++)    //ekrana yazdirmak icin de tekrar for döngüsü olusturup notlar[i] yi ekrana yazdiririz
            {
                System.out.println(notlar[i]);
            }

    }
}
    //