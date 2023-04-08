package _Gun_11_Ternary_MathMethods;

import java.util.Scanner;

public class _4_TernarySoru {
    public static void main(String[] args) {
         //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi=");
        int sayi=scan.nextInt();
        //1.yontem
        String deger=(sayi>50 ? "1" : "0");
        System.out.println("deger=" +deger);

        //ya da:
        System.out.println((sayi>50 ?1  :0 ));

    }
}
