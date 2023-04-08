package Odev_24_11;

import java.util.Scanner;

public class Soru_06_ {
    public static void main(String[] args) {

        //Soru:Bir sayi bulmaca oyunu yapin.Bilgisyar 10-20 arasinda sayi tutsun.


        Scanner scan = new Scanner(System.in);

        int min = 10;
        int max = 20;
        int tutulansayi = (int) (Math.random() * (max - min)) + min;

        int sayac = 0;

        while (sayac < 3) {


            System.out.println("Sayi giriniz:");
            int Girilensayi = scan.nextInt();



            if (Girilensayi != tutulansayi && sayac<3)
                System.out.println("Bilemediniz");

              sayac++;

            if (Girilensayi ==tutulansayi )

                System.out.println("Tebrikler");}

            if(sayac==3)
                System.out.println("Bilemediniz.Tutulan sayi=" + tutulansayi);




    }
}