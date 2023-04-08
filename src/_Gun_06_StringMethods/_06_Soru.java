package _Gun_06_StringMethods;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        //girilen bir ad soyadi Ìsmet Temur
        //I.T.seklinde yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Adiniz soyadiniz=");
        String adSoyad= scan.nextLine();
        // ad soyad su an veri olarak alindi

        char ilkHarf=adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf("");
        char soyadIlkHarf =adSoyad.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+soyadIlkHarf +".");

        //int siz hali:
        // char soyadIlkHarf=adSoyad.charAt(adSoyad.indexOf(" ")+1);








    }
}
