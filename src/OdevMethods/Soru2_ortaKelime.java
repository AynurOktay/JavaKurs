package OdevMethods;

import java.util.Scanner;

public class Soru2_ortaKelime {
    public static void main(String[] args) {
        // "OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //      Ortadaki kelimeyi return yapınız.
        //    Örnek: Ben Java'yı seviyorum.
        //print : Java'yı
        //Örnek2:
        //Java'yı kolayca öğreniyorum.
        //print: kolayca
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();

        System.out.println(ortaKelimeBul(cumle));
    }

    public static String ortaKelimeBul(String str) {
        int ilkBosluk=str.indexOf(" ");
        int sonBosluk=str.lastIndexOf(" ");

        return str.substring(ilkBosluk+1 , sonBosluk);




    }
}