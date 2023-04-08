package _Gun_06_StringMethods;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Cadde.");
        String cadde= scan.nextLine();
        System.out.println("cadde = " + cadde);

        System.out.println("Sokak:");
        String sokak= scan.nextLine();
        System.out.println("sokak = " + sokak);


        System.out.println("Posta kodu:");
         int postaKodu= scan.nextInt();
        System.out.println("postaKodu = " + postaKodu);

        System.out.println("Ulke:");
        String ulke= scan.nextLine();
        System.out.println("ulke = " + ulke);



    }
}
