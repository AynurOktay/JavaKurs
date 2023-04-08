package _Gun_12_Switch;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi1=");
        int sayi1= scan.nextInt();

        System.out.println("Sayi2=" );
        int sayi2= scan.nextInt();

        System.out.println("Toplama icin T");
        System.out.println("Cikarma icin c");
        System.out.println("Carpma icin P");
        System.out.println("Bolme icin B");
        System.out.println("Seciminiz=");
        Scanner scanStr=new Scanner(System.in);
        String secim=scanStr.next();

        //merdivenli if,ladder if

        if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplam=" +(sayi1+sayi2));
        else
            if(secim.equalsIgnoreCase("C"))
                System.out.println("Farki=" + (sayi1-sayi2));
            else
                if(secim.equalsIgnoreCase("P"))
                    System.out.println("Carpim="+(sayi1*sayi2));
                else
                    if(secim.equalsIgnoreCase("B"))
                        System.out.println("Bolum=" +(sayi1/sayi2));
                    else
                        System.out.println("Yanlis secim");
    }
}
