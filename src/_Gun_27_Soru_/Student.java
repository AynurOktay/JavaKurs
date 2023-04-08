package _Gun_27_Soru_;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
   ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle(Lesson ders) {  //burda nesnenin özelliklerini(dersleri) kullandigimiz icin static degil normal metod kullaniyoruz

        int suAnkiDersSaatiToplami = 0;
        for (Lesson d : dersleri)
            suAnkiDersSaatiToplami += d.saat;

        if (suAnkiDersSaatiToplami + ders.saat <= maxSaat)
            dersleri.add(ders);
        else
            System.out.println("Kredinizi astiniz.Yeni ders eklenememektedir" + "Eklenemeyen ders:" + ders.name);

    }

    public void dersleriYazdir(){
        System.out.println("\n***Transkript***");
        System.out.println("Sayin "+name);
        System.out.println("Aldiginiz dersler asagidadir.");

        for(Lesson d:dersleri)
            System.out.println(d.name+" "+d.saat);
    }

    public static void universiteKurallari(){
        System.out.println("Kural 1:Caysiz ve üzümsüz derse gelme");
        System.out.println("Kural 2:Uykunu mutlaka al ,saglik en önemlisi");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın ");
        System.out.println("Kural 5: İnş, biz bu işi başaracağız.");
    }


    }









