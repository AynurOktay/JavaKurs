package _Gun_11_Ternary_MathMethods;

import java.util.Scanner;

public class _07_MathSoru {
    public static void main(String[] args) {
        //Girilen 3 syidan buyuk olani bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi 1 giriniz:");
        int a=scan.nextInt();
        System.out.print("Sayi 2 giriniz:");
        int b= scan.nextInt();
        System.out.print("Sayi 3 giriniz:");
        int c=scan.nextInt();

        System.out.println("En buyuk sayi=" + Math.max(a, Math.max (b,c)));

        // ya da

        int enb=Math.max(a,b);
        enb=Math.max(enb,c);
        System.out.println("enb="+ enb);
    }
}
