package Odev_OOP.Soru2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* 6 class oluşturuldu. Calculator, Sum, Divide, Multiply , Substract , Main
        Calculator'ı a super class yap.
       Main class'ın içinde
        scanner object oluşturunuz.
                iki int oluştur ve bu iki int değişkenine scanner ata.
        Sum methodu çağır ve sonucu yazdır.
        Divide methodu çağır ve sonucu yazdır.
        Multiply methodu çağır ve sonucu yazdır.
        Substract methodu çağır ve sonucu yazdır.*/



        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayi giriniz");
        int a = scan.nextInt();
        int b= scan.nextInt();

        Sum topla=new Sum(a,b);
        System.out.println("topla = " + topla.calculating(a,b));

        Substract cikar=new Substract(a,b);
        System.out.println("cikar = " + cikar.calculating(a,b));

        Divide böl=new Divide(a,b);
        System.out.println("böl = " + böl.calculating(a,b));

        Multiply carp=new Multiply(a,b);
        System.out.println("carp = " + carp.calculating(a,b));









    }
}
