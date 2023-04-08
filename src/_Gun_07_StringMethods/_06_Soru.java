package _Gun_07_StringMethods;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        //Tek seferde girilen bir ad soyadin adini ve soyadini ayirip ,
        //ayri ayri yazdiriniz

        Scanner scan =new Scanner(System.in);
        System.out.println("Ad ve soyadinizi yaziniz");
        String adSoyad=scan.nextLine();

        int boslukIndex=adSoyad.indexOf(" ");

        String ad=adSoyad.substring(0,boslukIndex);
        String soyad=adSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
