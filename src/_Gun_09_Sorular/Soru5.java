package _Gun_09_Sorular;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sifrenizi  girin");
        String sifre1=scan.nextLine();
        System.out.println("Sifrenizi tekrar girin");
        String sifre2=scan.nextLine();

        boolean ayniMi=sifre1.equals(sifre2);
        if(ayniMi==true)
            System.out.println("Ayni");

        if(ayniMi==false)
            System.out.println("Degil");


        //2.yol


        if(sifre1.equals(sifre2)==true)
            System.out.println("Ayni");

        if(sifre1.equals(sifre2)==false)
            System.out.println("Degil");













    }
}
