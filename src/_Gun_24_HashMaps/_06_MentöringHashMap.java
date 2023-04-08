package _Gun_24_HashMaps;

import java.util.*;

public class _06_MentöringHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();//valuelar ayni olabilir ama keyler frakli olmak zorunda
        hm.put(1, "kedi");
        hm.put(2, "kedi");
        hm.put(3, "kedi");
        hm.put(4, "köpek");
        System.out.println("hm=" + hm);

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(2, "aslan");
        lhm.put(3, "tilki");
        lhm.put(1, "kedi");
        System.out.println("lhm = " + lhm);//ekleme sirasina göre yazdiir

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(0, "Deve");
        tm.put(9, "Kelebek");
        tm.put(1, "Guvercin");
        tm.put(5, "Yilan");
        System.out.println("tm = " + tm); //keylere göre sort yapti

        //keyleri ve value lari ayri yazdirmak icin:
        for (Integer key : tm.keySet()) {
            System.out.println("key = " + key);

            for (String value : tm.values()) {
                System.out.println("value = " + value);
            }

        }

        //ke ve value larin hepsini yazdirmak icin:
        for (Map.Entry<Integer, String> keyValue : tm.entrySet()) {
            System.out.println("keyValue.getKey = " + keyValue.getKey());
            System.out.println("keyValue.getValue = " + keyValue.getValue());

            HashSet<Integer> hs = new HashSet<>();
            addElements(hs, 1, 2, 3, 4);
            System.out.println("hs metodla yazdir= " + hs);

            HashSet<Integer>hs2=generateSet();
            System.out.println("hs2 metodla= " + hs2);

        }
        //Ornek soru:AddElemnts seklinde bir metodla 1 veya 1 den fazla sayi eklenebilen metodu yaziniz.
        //Cevap:
    }
   //Ornek soru2:Bir metod olusturup bir hashSeti verilen bu numaralar ile doldurun{1,2,3,4,5,6,7}
       //bu islemi generateSet() metodul ile yapin.mainde yazdirin
   public static HashSet<Integer>generateSet(){
        Integer[] dizi={1,2,3,4,5,6,5,6,7};
        HashSet<Integer>hs2=new HashSet<>(Arrays.asList(dizi));
        return hs2;

   }



    public static void addElements(HashSet<Integer> hs, Integer... sayilar) {
        //1.yontem
        hs.addAll(Arrays.asList(sayilar));

        //2.yontem:
        Collections.addAll(hs, sayilar);

        //3.yontem
        for (int i = 0; i < sayilar.length; i++) {
            hs.add(sayilar[i]);


        }

    }







}


