package Odev_String_15_11;

import java.util.Scanner;

public class OzelSoru1 {
    public static void main(String[] args) {

    //Ayri ayri girilen ad ve soyadi aralarinda bir bosluk koyarak birlestirin

        Scanner scan=new Scanner(System.in);

        //Soru 1
        System.out.print("Ad=");
        String ad=scan.nextLine();

        System.out.print("Soyad=");
        String soyad=scan.nextLine();

        String bosluk=" ";

        String adSoyad=(ad+bosluk+soyad);
        System.out.print("Ad Soyad = " + adSoyad);









        
    }
}
