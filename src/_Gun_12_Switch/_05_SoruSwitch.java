package _Gun_12_Switch;

import java.util.Scanner;

public class
_05_SoruSwitch {
    public static void main(String[] args) {

        //daha once cozdugunuz hesap makinesi sorusunu switch ile cozunuz


        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi1=");
        int sayi1= scan.nextInt();

        System.out.println("Sayi2=" );
        int sayi2= scan.nextInt();

        System.out.println("Toplama icin T");
        System.out.println("Cikarma icin C");
        System.out.println("Carpma icin P");
        System.out.println("Bolme icin B");
        System.out.println("Seciminiz=");
        Scanner scanStr=new Scanner(System.in);
        String secim=scanStr.next();

      switch(secim.toUpperCase()){
        case "T":
        System.out.println("Toplama"+(sayi1+sayi2));break;
        case "C":
        System.out.println("Cikarma"+(sayi1-sayi2));break;
        case "P":
        System.out.println("Carpma"+(sayi1*sayi2));break;
        case "B":
        System.out.println("Bolme"+((double)sayi1/sayi2));break;
        default:
        System.out.println("Hatali secim");
}

    }
}
