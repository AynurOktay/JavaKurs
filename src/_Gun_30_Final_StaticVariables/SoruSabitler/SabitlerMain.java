package _Gun_30_Final_StaticVariables.SoruSabitler;

import java.util.Scanner;

public class SabitlerMain {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun,  , dakika alarak toplam
        // saniyeyi bulunuz.


        int gun=0;
        int saat=0;
        int dakika=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("gun sayisi=");
         gun= scan.nextInt();
        System.out.println("saat sayisi=");
        saat= scan.nextInt();
        System.out.println("dakika sayisi=");
        dakika= scan.nextInt();

        //1.yontem:
        int toplamSaniye=
                gun
                *Sabitler.birGundekiSaatSayisi
                *Sabitler.birSaattekiDakikaSayisi
                *Sabitler.birdakikadakiSaniyeSayisi
                +
                saat
                *Sabitler.birSaattekiDakikaSayisi
                *Sabitler.birdakikadakiSaniyeSayisi
                +
                dakika
                *Sabitler.birdakikadakiSaniyeSayisi;
        System.out.println("Toplam saniye=" +toplamSaniye);

        //2.yontem;(metod kullanarak)
        System.out.println("toplamSaniye=" +Sabitler.hesapla(gun,saat,dakika));




    }
}
