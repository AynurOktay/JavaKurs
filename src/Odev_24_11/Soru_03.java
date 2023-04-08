package Odev_24_11;

import java.util.Scanner;

public class Soru_03 {
    public static void main(String[] args) {

        //Kullanicini girecegi sayiya kadar olan sayilarin toplamini bulun

        Scanner scan=new Scanner(System.in);
        System.out.println("GirilenSayi=");
        int girilenSayi= scan.nextInt();
        int toplam=0;
        int sayac=0;

       while(sayac<=girilenSayi){

            sayac++;
            toplam=toplam+sayac;}

        System.out.println("Toplam="+toplam);

// kullanici once sayi giriyor ama o sayiya kadar olan sayilari döngüde tek tek okutup(sayac artar) toplama ekliyoruz.
        //kullanicinin girdigi sayiya gelince döngü bitiyor,toplami yazdiriyor





}
}
