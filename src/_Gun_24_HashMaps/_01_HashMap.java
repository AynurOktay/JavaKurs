package _Gun_24_HashMaps;

import java.util.HashMap;

public class _01_HashMap {
    public static void main(String[] args) {
        //Sets=> HashSet,LinkedHashSet,TreeSet
        //Map=>HashMap ,LinkedHashMap ,TreeMap
        //Map => Anahtar +Set => Anahtarli set

        //key in tipi Integer, value tipi String olsun

        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(1001,"Ismet Temur");
        hm.put(1002 ,"Cihat Yilmaz");
        hm.put(2001, "Talip Yildiz");
        hm.put (1002 ,"Hatice Bayrak");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001)=" + hm.get(2001));
        System.out.println("hm.get(5001)="+ hm.get(1002));

        System.out.println("hm.containsKey(2001)=" +hm.containsKey(2001));

        System.out.println( "hm.keySet()=" +  hm.keySet());
        System.out.println( "hm.values=" + hm.values());

        hm.remove(2001);
        System.out.println("hm=" +hm);




    }
}
