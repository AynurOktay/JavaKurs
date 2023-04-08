package _Gun_42_StringBuffer_Builder_VeriTipleri;

import java.util.Arrays;

public class VeriTipleriMetodlarda {
    public static void main(String[] args) {
       // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar,
        //    bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri,
        //    bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler.
        //    Eşitlemelerde referanslar eşitlenir.


        //Ilkel tip:
        int sayi=5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi);

        //referans tip
        int[] dizi ={1,2,3};
        diziSifirla(dizi);
        System.out.println("Arrays.toString(dizi = " + Arrays.toString(dizi));

        //Nesne tipler:
        String kelime="Ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);
    }

    public static void sayiArtir(int sayi){                //referans degerlerin kendisi gelir

        sayi++;
    }
    public static void diziSifirla(int []dizi){
        dizi[0]=0;      dizi[1]=0;     dizi[2]=0;
    }

    public static int sayiArtir2(int sayi){
        sayi=sayi+1;
        return sayi;
    }
    public static void kelimeSifirla(String kelime){      //degeri gelir
        kelime="";
    }




}
