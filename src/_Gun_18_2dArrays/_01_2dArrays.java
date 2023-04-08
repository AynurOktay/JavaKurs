package _Gun_18_2dArrays;

import java.util.Scanner;

public class _01_2dArrays {
    public static void main(String[] args) {


        int sayi=0;   //1 tane sayi
        int[] dizi=new int[100]; //100 sayi

        int[] ders1Notlari=new int[50]; //50 kisilik sinifin 1.dersin notlari
        int[] ders2Notlari=new int[50];  //0-49 arasi index degisiyor
        int[] ders3Notlari=new int[50];

        int[][] tumDersNotlari =new int[3][50];//3 satir,50 sütun
                                             // 3 tane ders ,50 tane ögrenci icin

        ders1Notlari[0]=80; //tek boyutlu dizinin ilk(0) .elemanina 80 degerini atadik
        tumDersNotlari[0][0] =80; //2 boyutlu dizide 0.satirin ,0.sütununa 80 degeri atadik

        System.out.println("Tum ders Notlari=" +tumDersNotlari[0][0]); //yazdiriyoruz

        Scanner scan=new Scanner(System.in);  //Kullanicidan deger alma
        tumDersNotlari[0][0]=scan.nextInt();


    }
}
