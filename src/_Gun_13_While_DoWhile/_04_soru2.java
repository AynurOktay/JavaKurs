package _Gun_13_While_DoWhile;

import java.util.Scanner;

public class _04_soru2 {
    public static void main(String[] args) {

        //Girilen 20 sayidan pozitif olanlari toplayin

        Scanner scan=new Scanner(System.in);

       int sayac=0;
       int toplam=0;
       while(sayac<20)
       {
           System.out.println(sayac+ ".sayiyi gir:");
           int sayi= scan.nextInt();

           if (sayi>0)
               toplam=toplam+sayi;

           sayac++;
       }

        System.out.println("Toplam="+toplam);

       }
    }

