package Mentoring3;

import java.util.Arrays;

public class SoruArray {
    public static void main(String[] args) {
    //dizideki en buyuk ve en kucuk sayiyi yazdiriniz:

        int[] arr=new int[]{11,22,33,44,88,77};
        //1.yontem:
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        //2.yontem
        int enb=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>enb)
               enb=arr[i];


        }

        System.out.println(enb);

    }
}
