package _Gun_09_Sorular;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Cumle giriniz:");
        String cumle=scan.nextLine();

        cumle=cumle.toLowerCase();//bütün büyük harfler kücük oldu

       // gerisi önceki sounun aynisi

       if (cumle.contains("a"))
           System.out.println("Evet");

       if ( !cumle.contains("a"))
           System.out.println("Hayir");










    }
}
