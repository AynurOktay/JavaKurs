package _Gun_08_Operators;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        //Girilen iki sayinin birbirine esit olup olmadigini yazdiriniz


        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayi=");
        int sayi1=scan.nextInt();
        System.out.println("Ikinci sayi=");
        int sayi2=scan.nextInt();

        System.out.println("Esit mi?" + (sayi1==sayi2));

    }
}
