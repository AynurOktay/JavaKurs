package _Gun_17_ArrayMethods;

public class _01_ArraySoru_tekCiftBulma {
    public static void main(String[] args) {

        //50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int[] dizi = new int[50];

        for (int i = 0; i < dizi.length; i++) {

            dizi[i] = (int) (Math.random() * 10);   //diziye random sayi atiyoruz
        }

        for (int i = 0; i < dizi.length; i++) {     //once diziyi yazdiriyoruz
            System.out.println("dizi once=" + dizi[i]);

        }
        for (int i = 0; i < dizi.length; i++) {//butun sayilara tek tek bakacagi icin tekrar bir döngü olusturuyoruz.
            if (dizi[i] % 2 == 0)
                dizi[i] = 0;
            else
                dizi[i] = 1;
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi sonra=" + dizi[i]);  //tek mi cift mi diye baktiktan sonra tekrar yazdiriyoruz
        }
    }
}