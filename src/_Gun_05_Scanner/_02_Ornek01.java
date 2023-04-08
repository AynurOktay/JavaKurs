package _Gun_05_Scanner;

import java.util.Scanner;

public class _02_Ornek01 {
    public static void main(String[] args) {

        //Girilen bir adi ekrana yazdiriniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Adinizi giriniz=");
        String ad= scan.next();  //next ekrandan bir kelime okur.
        System.out.println("ad = " + ad);


    }
}
