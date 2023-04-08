package Odev_String_15_11;

import java.util.Scanner;

public class OzelSoru9 {
    public static void main(String[] args) {

        // 3 kelimelik ismi olan kisinin adinin bas harflerini aralarinda nokta olacak sekilde yazdrin

        Scanner scan=new Scanner(System.in);
        System.out.println("Ilk isim");
        String isim1=scan.nextLine();

        System.out.println("Ikinci isim=");
        String isim2=scan.nextLine();

        System.out.println("Soyad=");
        String soyad=scan.nextLine();

        String basHarfler= isim1.charAt(0)+"."+isim2.charAt(0)+"."+soyad.charAt(0)+".";
        System.out.println("basHarfler = " + basHarfler);

        //Isim tek seferde girilirse
        String isim="Ismail Cem Oktay";
        char char1=isim.charAt(0);
        int bosluk1=isim.indexOf(" ");
        char char2=isim.charAt(bosluk1+1);
        int bosluk2=isim.lastIndexOf(" ");
        char char3=isim.charAt(bosluk2+1);
        System.out.println("Bas harfler:" +char1+"."+char2+"."+char3+".");

    }
}
