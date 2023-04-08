package _Gun_11_Ternary_MathMethods;

import java.util.Scanner;

public class _05_TernarySoru {
    public static void main(String[] args) {

        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi=");
        int sayi=scan.nextInt();

        System.out.println(sayi==0 ? "Sifir " : (sayi>0 ? "pozitif" : "Negatif"));



    }
}
