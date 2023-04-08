package _Gun_14_ForLoop;

import java.util.Scanner;

public class _05_ForSoru {
    public static void main(String[] args) {

        //Girilen bir sayiya kadar(dahil) olan sayilarin carpimini bulun.
        //Carpimin degeri 1000 gectiginde islem sonlansin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi girin=");
        int sayi = scan.nextInt();

        int carpim = 1;

        for (int i = 2; i <= sayi; i++)//sayinin 1 ile carpimi aynisi oldugundan i'yi 2 den baslatirsak
        {                         // islemi bir adim kisaltiriz.i 0 olmaz.olursa sonuc hep 0 cikar

            carpim *= i;
            if (carpim > 1000) {
                System.out.println("break calisti");
                break;

            }
        }
        System.out.println("Carpim=" + carpim);

    }
}