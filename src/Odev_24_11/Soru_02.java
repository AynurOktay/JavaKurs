package Odev_24_11;

import java.util.Scanner;

public class Soru_02 {
    public static void main(String[] args) {

        //Kullanicinin girdigi 20 sayidan kacinin tek oldugunu bulunuz.

        Scanner scan=new Scanner(System.in);

        int sayac1=1;
        int sayac2=0;

        while(sayac1<=20){

            System.out.print(sayac1+".sayiyi girin:");
            int sayi=scan.nextInt();
            sayac1++ ;

            if(sayi%2==1)
                sayac2++;
                }

                System.out.println("Tek sayi sayisi==" +sayac2);
    }
}
