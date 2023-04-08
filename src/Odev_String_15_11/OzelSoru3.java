package Odev_String_15_11;

import java.util.Scanner;

public class OzelSoru3 {
    public static void main(String[] args) {
        //Girirlen bir cumledeki a harfi sayisini bulunuz

        Scanner input2=new Scanner(System.in);
        System.out.println("Cumleyi giriniz:");
        String cumle2=input2.nextLine();

        int cumle1Uzunluk=cumle2.length();
        String aHarfiSil=cumle2.toLowerCase().replaceAll("a","");

        int cumle2Uzunluk=aHarfiSil.length();
        System.out.println(cumle1Uzunluk-cumle2Uzunluk);

         //not:cumleyi a harfi varken ve yokken saydik.
        // 2 cumlenin karakterleri arasindaki fark a harfi sayisini verir



    }
}
