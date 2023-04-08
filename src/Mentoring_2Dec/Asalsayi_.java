package Mentoring_2Dec;

import java.util.Scanner;

public class Asalsayi_ {
    public static void main(String[] args) {


// girilen sayinin asal olup olmadigini bulunuz.
        Scanner oku_int = new Scanner(System.in);
        int i, a, b = 0;
        i = 1;
        System.out.print("sayiyi giriniz= ");
        a = oku_int.nextInt();
        while (i <= a) {
            if (a % i == 0) b++;
            i++;
        }
        System.out.println(b == 2 ? "asal sayidir" : "asal sayi degildir");

    }
}