package _Gun_05_Scanner;

import java.util.Scanner;

public class _09_Ornek8 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz=");
        double kilo= scan.nextDouble();

        System.out.println("Boyunuzu giriniz=");
        double boy= scan.nextDouble();

        double index=kilo/(boy*boy);
        System.out.println("index = " + index);
    }
}
