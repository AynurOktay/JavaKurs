package _Gun_05_Scanner;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        //Kullanicidan aldiginiz 2 tam sayinin toplamini ekrana yazdiriniz

        Scanner scan=new Scanner(System.in);



        System.out.println("sayi1 =" );
        int sayi1= scan.nextInt();

        System.out.println("sayi2 = " );
        int sayi2= scan.nextInt();

        int toplam=sayi1+sayi2;
        System.out.println("toplam = "+ toplam);


    }
}
