package Odev_String_15_11;

import java.util.Scanner;

public class OzelSoru7 {
    public static void main(String[] args) {

        //Girilen bir cumlede kac kelime oldugunu bulun

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz:");
        String cumle=scan.nextLine();

        int ilkUzunluk=cumle.length();
        System.out.println("Ilk uzunluk=" +ilkUzunluk);

        String boslukSil=cumle.replace(" ","");
        int ikinciUzunluk=boslukSil.length();
        System.out.println("son uzunluk=" +ikinciUzunluk);
        int kelimeSayisi=(ilkUzunluk-ikinciUzunluk)+1;
        System.out.println("cumledeki kelime sayisi=" +kelimeSayisi);



    }
}
