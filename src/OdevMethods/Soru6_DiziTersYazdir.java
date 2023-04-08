package OdevMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Soru6_DiziTersYazdir {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int[]dizi=new int[5];
        for (int i = 0; i <dizi.length ; i++) {
            System.out.print(i+".sayi=");
            dizi[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(dizi));

        diziTersYazdir(dizi);

    }
    public static void diziTersYazdir(int[]sayilar){
        for (int i = sayilar.length-1; i >=0 ; i--) {
            System.out.print(sayilar[i]);
        }
    }
}
