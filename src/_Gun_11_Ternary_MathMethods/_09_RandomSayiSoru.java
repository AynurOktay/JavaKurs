package _Gun_11_Ternary_MathMethods;

import java.util.Scanner;

public class _09_RandomSayiSoru {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi siniri=");
        int sinir=scan.nextInt();

        int tutulanSayi=(int)(Math.random()* sinir);

        System.out.println("Tahmininiz=");
        int tahmin=scan.nextInt();

        if (tahmin==tutulanSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedin");





    }
}
