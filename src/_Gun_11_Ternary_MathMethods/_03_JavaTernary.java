package _Gun_11_Ternary_MathMethods;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi=");
        int sayi=scan.nextInt();

        if (sayi %2 ==0)
            System.out.println("Cift");
        else
            System.out.println("Tek");

        String sonuc=(sayi %2 ==0) ? "Cift" : "Tek ";
        System.out.println("Sonuc=" +sonuc);

        System.out.println((sayi %2 ==0) ? "Cift" : "Tek ");

    }
}
