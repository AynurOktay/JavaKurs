package Mentoring3;

import java.util.Arrays;

public class _03_Arrays {
    public static void main(String[] args) {


        int[]dizi=new int[5];

        for (int i = 0; i <dizi.length ; i++) {

            System.out.println(dizi[i]);

        }
         Arrays.sort(dizi);

        System.out.println(Arrays.toString(dizi));
    }

}
