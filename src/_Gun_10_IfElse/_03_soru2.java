package _Gun_10_IfElse;

import java.util.Scanner;

public class _03_soru2 {
    public static void main(String[] args) {
        //girilen bir sayinin tek mi cift mi oldugunu yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi= scan.nextInt();

        if (sayi%2==0)
            System.out.println("Cift sayi");
        else
            System.out.println("Tek sayi");

    }
}

