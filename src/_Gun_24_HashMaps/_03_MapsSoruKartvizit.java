package _Gun_24_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class _03_MapsSoruKartvizit {
    public static void main(String[] args) {
          //Bir kartvizit uygulamasini 2 kisi icin yapin

        HashMap<String,String> uKartVizit= new HashMap<>();
        uKartVizit.put("isim" , "Ugur Yilmaz");
        uKartVizit.put ("email" , "ugur@gmail.com");
        uKartVizit.put ("adres" ,"Cekmekoy/Istanbul");
        uKartVizit.put  ("telefon" ,"=5056667774");

        System.out.println("Isim="+uKartVizit.get("isim"));
        System.out.println("Tel="+uKartVizit.get("telefon"));

        HashMap<String,String> aKartVizit= new HashMap<>();
        aKartVizit.put("isim" , "Ayse Bayrak");
        aKartVizit.put ("email" , "ayse@gmail.comz");
        aKartVizit.put ("adres" ,"Sisli/Istanbul");
        aKartVizit.put  ("telefon" ,"=5376667774");




        HashMap <String , HashMap<String ,String> > kartvizitler = new HashMap<>();

        kartvizitler.put("ugur" , uKartVizit);
        kartvizitler.put ("ayse",aKartVizit);

        System.out.println("Ugur'un kartviziti=" +kartvizitler.get("ugur"));
        System.out.println("aysenin kartviziti=" +kartvizitler.get("ayse"));

        System.out.println("Aysenin adresi=" +kartvizitler.get("ayse").get("adres"));

        for (Map.Entry<String , HashMap<String ,String>> kv:kartvizitler.entrySet()) {
            System.out.println("E-mailler=" +kv.getValue().get("email"));
        }

    }
}
