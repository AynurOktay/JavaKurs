package Projects;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String ad,soyad,girdi,kullaniciAdi,sifre,sifreTekrar;
        int i=0;

        System.out.print("Ad=");
         ad = scan.nextLine();

        System.out.println(ad + " hosgeldin,soyadini girer misin?");

        System.out.print("Soyad=");
        soyad = scan.nextLine();


        System.out.println("Ad Soyad = " + ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase()
                + " " + soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase());



        do {
            System.out.println("Eger ad soyad dogru ise y tusuna basin ");
            girdi = scan.nextLine();


            if (girdi.equalsIgnoreCase("y") == true) {
                System.out.println("Adiniz ve soyadiniz basarili bir sekilde kaydedilmistir");
                break;
            }
            System.out.println("Tercihinizi dogru yapmadiniz.Lutfen tekrar deneyin");
            i++;
            if(i>3)
                break;
        }
           while (girdi.equalsIgnoreCase("y") != true) ;

                System.out.println("Lutfen kullanici adinizi belirleyin:");
                kullaniciAdi = scan.nextLine();

                System.out.println("Lutfen sifrenizi belirleyiniz");
                 sifre = scan.nextLine();

                System.out.println("Lutfen sifrenizi tekrar giriniz");
                sifreTekrar = scan.nextLine();

                if (sifre.equals(sifreTekrar) == true)
                    System.out.println("Tebrikler " + kullaniciAdi + " kullanici adiyla sisteme kayit oldunuz.");
                else
                    System.out.println("Yanlis veya hatali sifre girdiniz.");



        }
    }