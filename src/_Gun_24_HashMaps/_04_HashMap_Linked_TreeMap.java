package _Gun_24_HashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_HashMap_Linked_TreeMap {
    public static void main(String[] args) {
        //Hizli calismak icin kendinden sirali
        Map<Integer, String> hm =new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11, "kus");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);

     //Maplerden LinkedHashMap -Eklendigi siraya göre sirali
       Map<Integer, String> lhm =new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11, "kus");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);

     //Maplerden Treemap _Kendinden sortlu(kucukten buyuge gore yada alfabetik)
        Map<Integer, String> tm =new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11, "kus");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm);


    }
}
