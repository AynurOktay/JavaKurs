package Odev_String_15_11;

import java.util.Scanner;

public class OzelSoru6{
    public static void main(String[] args) {

        //girilen en az 3 kelimelik bir cumledeki ilk iki kelimeyi yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Uc kelimelik bir cumle giriniz");
        String cumle=scan.nextLine();

        int boslukIndex1=cumle.indexOf(" ");
        int boslukIndex2=cumle.lastIndexOf(" ");


        System.out.println("Ilk iki kelime="+cumle.substring(0,boslukIndex1)+cumle.substring(boslukIndex1,boslukIndex2));
    }
}
