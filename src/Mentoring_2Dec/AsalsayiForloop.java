package Mentoring_2Dec;

import java.util.Scanner;

public class AsalsayiForloop {
    public static void main(String[] args) {
        //Girilen bir sayinin asal sayi olup olmadigini  bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi girin=");
        int sayi = scan.nextInt();
        int sayac = 0;

        if (sayi < 1) {
            System.out.println("Lutfen 1den buyuyk bir sqayi giriniz");
        } else {
            for (int i = 1; i <= sayi; i++) {

                if (sayi % i == 0)

                    sayac++;
            }

        }
        if (sayac == 2) {
            System.out.println("sayi asaldir");
        } else {
            System.out.println("asal degildir");
        }





            }
        }



//
