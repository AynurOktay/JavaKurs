package _Gun_10_IfElse;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {



        //Soru:yanyana aralarinda bir boslukla girirlen 2 int sayinin
        // birbirine esit olup olmadigini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Aralarinda bosluk birakarak iki sayi giriniz");

        String sayilar=scan.nextLine();

        int boslukIndex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,boslukIndex);
        String strSayi2=sayilar.substring(boslukIndex+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);

        if (sayi1 ==sayi2)
            System.out.println("Esit");
        else
            System.out.println("Degil");

    }
}