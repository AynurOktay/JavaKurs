package _Gun_24_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class _02_Maps {
    public static void main(String[] args) {

       HashMap<Integer ,String> hm =new HashMap<>();
       hm.put(1001 ,"Ismet Temur");
        hm.put(1002 , "Cihat Yilmaz");
        hm.put(2001,"Talip Yilmaz");
        hm.put(5001,"Eyupcan Bilgin");
        hm.put(1002,"Hatice Bayrak");

        System.out.println("hm.keySet()"  +hm.keySet()); //sadece keyleri yazdirir-dizi seklinde
        System.out.println("hm.value() = " + hm.values()); //sadece valuelari yazdirir


        for (Integer k: hm.keySet()) {
            System.out.println(k+"\t");

            System.out.println();

          for (String v : hm.values())      //Sadece String olan valuelari altalta yazdirir
              System.out.println(v+ "\t");

            System.out.println();                                  //Hepsini yanyana yazirir
            for (Map.Entry<Integer,String> kv: hm.entrySet()) {      // no-isim seklinde
                System.out.println(kv.getKey()+"-" + kv.getValue());
            }

        }




    }
}
