package _Gun_19_2dArrays_Methods;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {

         tekmiciftMi(55);
         tekmiciftMiOku();
    }

    public static void tekmiciftMi(int sayi) {
        if (sayi % 2 != 0)
            System.out.println("tek");
        else
            System.out.println("cift");


    }


    public static void tekmiciftMiOku() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi giriniz=");
        int sayi=scan.nextInt();

        tekmiciftMi(sayi);

    }

}




