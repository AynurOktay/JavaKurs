package _Gun_19_2dArrays_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class _03_soru {
    public static void main(String[] args) {

        //Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner scan = new Scanner(System.in);
        int[][] tablo = new int[3][2];
        int tekMiktar = 0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("Sayi giriniz=");
                tablo[i][j] = scan.nextInt();

                if (tablo[i][j] % 2 == 1)
                    tekMiktar++; //yeni dizi de kac oda oldugunu anlamak icin tek miktarini buldum
            }
        }
       int[] teklerDizisi=new int[tekMiktar];

        tekMiktar=0; // odalara atamaya ilk 0 indexinden baslayacagimiz icin tek miktarini tekrar sifirliyoruz

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {

                if(tablo[i][j] %2!=0){

                teklerDizisi[tekMiktar]=tablo[i][j];
                tekMiktar++;

                }
            }
        }
        System.out.println(Arrays.toString(teklerDizisi));
    }
}