package _Gun_23_HashSets;

import java.util.HashSet;
import java.util.Iterator;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<String>renkler =new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        //Ekrana yazdirma. renkler=[Red,RED,Blue,Green] seklinde yazdirir.Ayni olanlari yazdirmaz
        System.out.println("renkler = " + renkler);


        //Ekrana tek tek yazdirma (for each ile)
        for(String renk : renkler) { //sira garanti degil
            System.out.println("Renk = " + renk);}

        /*for each ile ilgili dizi yazdirma örnegi:
        int[] dizi ={34,5,7,89,689,77};
        for (int sayi:dizi) {
            System.out.println("sayi" + sayi);*/

            //Setin kendi sirasi nasil ise ona göre yazdirir
          Iterator gosterge=renkler.iterator();
          while (gosterge.hasNext()){
              System.out.println("gosterdigi eleman = " + gosterge.next());
              //next göstergenin gösterdigi elemani temsil ediyor
          }

        }

    }

