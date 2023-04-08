package _Gun_19_2dArrays_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class _10_diziKucukBuyukElemanBulma {
    public static void main(String[] args) {
        //Kullaniocidan sayi alip 5 elemanli bir diziyi doldurduktan sonra;
        //dizinin en kucuk,en buyuk elemanini ve ortalamasini ayri metodlarla bulup yazdirin

        Scanner scan=new Scanner(System.in);
        int dizi[]=new int[5];
        for (int i = 0; i <dizi.length ; i++) {
            System.out.print((i+1)+".sayi=");
            dizi[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(dizi));
        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);

    }
    public static void enKucukYaz(int[]sayilar){

        Arrays.sort(sayilar);
        System.out.println("En kucuk sayi=" + sayilar[0]);


        }

    public static void enBuyukYaz(int[]sayilar){

        Arrays.sort(sayilar);
        System.out.println("En buyuk sayi=" + sayilar[sayilar.length-1]);}

    public static void ortalamaYaz(int[]sayilar){
        int toplam=0;
        int ortalama=0;

        for (int num:sayilar){

            toplam+=num;
            ortalama=toplam/ sayilar.length;

        }
        System.out.println(ortalama);






    }






}
