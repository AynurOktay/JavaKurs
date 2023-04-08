package _Gun_23_HashSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
       //10 elemanli bir sayiyi random(10 dahil) doldurduktan sonra,
        //tekrarli degerleri almayacak sekilde yeni bir diziye atin.


       Integer[]dizi=new Integer[10];    //hashSette Integer tanimli oldugu icin int i Integera cevirdik
        for (int i = 0; i <dizi.length ; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }
        System.out.println("dizi = " + Arrays.asList(dizi));  //10 sayinin hepsini yazdirdi


            //1.yontem:
            HashSet<Integer> hs=new HashSet();
            for (int i = 0; i < dizi.length ; i++) {
                hs.add(dizi[i]);                            //Hashsete atinca ayni olanlari cikardi,gerisini yazdirdi
            }
        System.out.println("hs = " + hs);

            //2.yontem:
        HashSet<Integer>hs2= new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs2 = " + hs2);

         //3.yontem:
        HashSet<Integer> hs3=new HashSet();
        Collections.addAll(hs3,dizi);
        System.out.println("hs3 = " + hs3);



            }




        }





