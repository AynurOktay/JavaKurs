package _Gun_05_Scanner;

import java.util.Scanner;

public class _06_Ornek6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdortgenin 2 kenar uzunlugunu giriniz=");

        int kenar1=scan.nextInt();
        int kenar2= scan.nextInt();
        int cevre=kenar1+kenar2+kenar1+kenar2 ;
        int alan=kenar1*kenar2;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
