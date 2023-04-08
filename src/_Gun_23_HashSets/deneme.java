package _Gun_23_HashSets;

import java.util.Arrays;
import java.util.HashSet;

public class deneme {
    public static void main(String[] args) {
        //10 elemanli bir sayiyi random(10 dahil) doldurduktan sonra,
        //tekrarli degerleri almayacak sekilde yeni bir diziye atin.

        Integer[] dizi = new Integer[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }

        System.out.println(Arrays.asList(dizi));  //10 sayinin hep


        HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs2 = " + hs2);

    }
    }

