package _Gun_14_ForLoop;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {

        // Girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadigini bulunuz.(sayi tam kare mi degil mi?)
        //

        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> tam kare değildir.
        // 9 girdim -> 3*3 tam karedir

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scan.nextInt();
        //5 girrildi;5e kadar sayilari (1,2,3,4) kendileriyle carparim,5i verip vermedigine bakarim
        //9 girildi ,,9 a kadar sayilari 1,2,3,4,5,6,7,..

        int sayac = 0;

        boolean tamkare=false;
        while (sayac < sayi)
        {

            System.out.println("sayac=" +sayac);

            if (sayac * sayac == sayi)   // 0*0 ,1*1 ,2*2 ,3*3==9 (sayiya kadar olan sayilarin birbiriyle carpimi,sayaclarin carpimidir
            {
                tamkare=true;
                System.out.println("Tam karedir");
                 break;

                //calistiginda döngüden cikmasi icin break yapariz,
                // yoksa devam eder

            }

            sayac++;

        }
        if(tamkare == false);

        System.out.println("Tam kare degildir");

    }

    }
