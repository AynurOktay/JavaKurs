package _Gun_11_Ternary_MathMethods;

import java.util.Scanner;

public class _01_soru1 {
    public static void main(String[] args) {

        //Girilen bir sayinin pozitif,negatif veya sifir oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=scan.nextInt();

         if (sayi > 0)
         {
             System.out.println("pozitif");
         }else
          if (sayi<0) {
             System.out.println("negatif");
         } else
            System.out.println("sifir");

          //ilk else i kullanmazsak pozitif yada negatif yazdiktan sonra sifir da yazar
         //sadece if kullanir else kullanmazsak ta herbirisi icin teker teker calisir.o da iyi degil

        }

    }

