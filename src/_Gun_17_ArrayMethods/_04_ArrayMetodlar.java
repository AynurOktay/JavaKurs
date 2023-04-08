package _Gun_17_ArrayMethods;

import java.util.Arrays;

public class _04_ArrayMetodlar {
    public static void main(String[] args) {

        //Diziyi  direk yazdirmak icin:Arrays.toString

        String [] isimler ={"ahmet","zeynep","roman","yasin","cihan"};
        System.out.println("isimler=" + Arrays.toString(isimler));

        int[]sayilar={2,3,4};
        System.out.println(Arrays.toString(sayilar));

        //Dizileri siralamak icin:

        Arrays.sort(isimler);
        System.out.println("Isimler="+Arrays.toString(isimler));//harf sirasina göre
        Arrays.sort(sayilar);
        System.out.println("Sayilar="+Arrays.toString(sayilar)); //kücükten büyüge

        //Diziler esit mi diye bakmak icin:

        int[] a= {1,8,3,45};
        int[] b= {1,8,3,45};
        int[] c= {1,8,2,45};

        System.out.println("Arrays.equals(a,b)=" + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,b)=" + Arrays.equals(a,c));

        //binarySearch:contains gibi çalışr , var ise pozitif bir değer döndürür,yok ise negatif
        //ama sadece sort ile siralanmis dizilerde calisiyor.Siralanmamissa calismaz.

        System.out.println("Arrays.binarySearch() = " + Arrays.binarySearch(b, 3)); // -2 döner.yok demek.(b nin icinde 3 var mi?)
        Arrays.sort(b); // ancak sıralanmış dizilerde doğru sonuç verir
        System.out.println("Arrays.binarySearch() = " + Arrays.binarySearch(b, 3)); // 1 döndü.var demek




    }




    }

