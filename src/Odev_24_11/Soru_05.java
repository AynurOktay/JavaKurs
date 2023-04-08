package Odev_24_11;



public class Soru_05 {
    public static void main(String[] args) {

        //100e kadar olan sayilardan kac tanesinin birler basamagi 5 tir.

        int sayi = 0;
        int sayac = 0;

        while (sayi <= 100) {
            sayi++;

            if (sayi % 10 == 5)
                sayac++;

        }

        System.out.println("Birler basamagi 5 olan sayi=" + sayac);


    }
}