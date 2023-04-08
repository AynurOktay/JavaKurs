package _Gun_23_HashSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {

        //SETA:
        //HashSet:Hizli ,bunun icin kendine göre algoritmik sirada tutar
        //LinkedHashSet:EKLEME SIRASIna göre sirali tutar
        // TreeSet : herzaman içinde SIRALI şekilde tutar, kendinden sortlu

        // Hızlı, bunun için kendine göre algoritmik sırada tutar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);

        //Ekleme sirasina göre siralar
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);

        //Her zaman icinde sirali sekilde tutar.Kendinden sortlu
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);






    }
}
