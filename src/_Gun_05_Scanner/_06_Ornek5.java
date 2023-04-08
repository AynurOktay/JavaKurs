package _Gun_05_Scanner;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {

        //Bir karenin kenarini kullanicidan al ve alanini ve cevresini
        // bulunuz,yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Karenin 1 kenar uzunlugu=");

        int kenar= scan.nextInt();
        int alan=kenar*kenar;
        int cevre=kenar+kenar+kenar+kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
