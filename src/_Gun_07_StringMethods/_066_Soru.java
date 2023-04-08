package _Gun_07_StringMethods;

import java.util.Scanner;

public class _066_Soru {
    public static void main(String[] args) {
        //tek seferde girilen ad ve soyadi ayirip,ayri ayri yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Ad ve soyad=");
        String adSoyad= scan.nextLine();

        int boslukIndex=adSoyad.indexOf(" ");

        String ad=adSoyad.substring(0,boslukIndex);

        String soyad=adSoyad.substring(boslukIndex+1);//soyadi boslugun 1 fazlasindan basladigi
        // icin +1 yazdik

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        //Farkli cözüm:System.out.println("ad= " + adSoyad.substring(0,adSoyad.indexOf(" ")+1)
        // + "\n" +"soyad= " + adSoyad.substring(adSoyad.lastIndexOf(

    }
}
