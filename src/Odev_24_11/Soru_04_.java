package Odev_24_11;

import java.util.Scanner;

public class Soru_04_ {
    public static void main(String[] args) {
        //Kullanicinin girecegi 20 sayidan 10 ile 30 arasindakilerin toplamini bulunuz.

        Scanner scan=new Scanner(System.in);
        int sayac=0;
        int toplam=0;

        while(sayac<=20){
            System.out.println("Sayi giriniz:");
            int sayi= scan.nextInt();
            sayac++;
            if(sayi>=10 && sayi<=30)
                toplam=toplam+sayi;

        }

        System.out.println("Toplam="+toplam);
    }
}
