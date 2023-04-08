package _Gun_20_Methods;

import java.util.Scanner;

public class _03_Faktoriyel_tekCiftbulma {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("sayi giriniz= ");
        int girilenSayi= scan.nextInt();
        int carpim=faktoriyel(girilenSayi);
        if (carpim%2==0)                            //faktoriyeli return metodla buldurup sonucu tek mi cift mi diye main de yazdirdik
            System.out.println("Cift");
        else
            System.out.println("Tek");

        }
   public static int faktoriyel(int girilenSayi){

       int carpim=1;
       for (int i = 0; i <girilenSayi ; i++) {
           carpim*=i;
       }
           return carpim;

   }
    }

