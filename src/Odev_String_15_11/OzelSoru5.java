package Odev_String_15_11;

import java.util.Scanner;

public class OzelSoru5 {
    public static void main(String[] args) {

        //Girilen bir cumledeki ilk kelimeyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle yaziniz.");
        String cumle=scan.nextLine();

        int boslukIndex=cumle.indexOf(" ");

        System.out.println("Ilk kelime="+cumle.substring(0,boslukIndex));
    }
}
