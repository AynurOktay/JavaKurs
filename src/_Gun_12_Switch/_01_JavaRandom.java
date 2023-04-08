package _Gun_12_Switch;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {

        //Randomla 0-5 arasi gibi sayilar urettik.
        //4-9 arasi gibi sayilari uretmek icin
        //Yontem su:once aralik kadar normal üretiyoruz(yani 0-5 arasi
        //Sonra üretilmis sayiya minimum sayiyi ekel(orn.uretilmis sayi +4)
        //(int) (Math.Random()+(max-min))+min

        //Soru Girilen max ve min araliginda random sayi urettirtiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("min=");
        int min=scan.nextInt();

        System.out.println("max=");
         int max=scan.nextInt();

         int rndSayi=(int)(Math.random()*(max-min))+min;
        System.out.println("rndSayi=" + rndSayi);



    }
}
