package ArraysOdev_3Aralik;

import java.util.Arrays;

public class Soru_9 {
    public static void main(String[] args) {
     //Arraydeki en buyuk elemani yazdiran bir program yazin

        int[]sayilar={15,25,22,18,30};
        int enb=0;

        for (int i = 0; i <5 ; i++) {

            if(sayilar[i] >enb)
                enb=sayilar[i];

        }
        System.out.println(enb);





    }
}
