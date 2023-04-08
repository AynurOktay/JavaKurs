package OdevMethods;

import java.util.Arrays;

public class Soru8_ArrayBirlestirme {
    public static void main(String[] args) {
      //  append adında bir method oluşturun.`
      //  Parametre olarak iki int array  oluşturun.`
       // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün
        // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //Bunu döndürmelidir:
       // {2, 4, 6, 1, 2, 3, 4, 5}
        //

        int[]dizi1={2,4,6};
        int[]dizi2={1,2,3,4,5};
        int[]sonuc=append(dizi1,dizi2);
        System.out.println(Arrays.toString(sonuc));
    }
    public static int[] append (int[]arr1 ,int[]arr2){
       int[]sonuc =new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            sonuc[i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            sonuc[arr1.length+i]=arr2[i];
        }



        return sonuc;

    }









}
