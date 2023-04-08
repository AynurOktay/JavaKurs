package _Gun_19_2dArrays_Methods;

import java.util.Arrays;

public class _08_Soru_DiziyiRandomYazdirmaMeth {
    public static void main(String[] args) {
// main classta 20 elemanlı bir diziyi tanimlayiniz.
// Daha sonra bir fonksiyona göndererek Dizinin elemanlarını 100 kadar random sayılarlave aynı fonksiyonda yazdırınız.



        int []dizi =new int[20];

        diziDoldurYazdir(dizi);  //soruda diziyi fonksiyona gönderin dedigi icin paranteze dizi yaziyoruz.cunku methoda dizideki tanimlanan sayilar gidecek
    }
    public static void diziDoldurYazdir(int [] sayilar){  //dizinin tipini buraya yaziyoruz.ayni ismi vermek zorunda degiliz

        for (int i = 0; i < sayilar.length; i++) {     //diziyi doldurduk
            sayilar[i]=(int) (Math.random()*100);
        }

        System.out.println("Sayilar=" + Arrays.toString(sayilar));
}



}