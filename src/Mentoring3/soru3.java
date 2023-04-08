package Mentoring3;

import java.util.Arrays;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        // Ornek 3 : Kullanici tarafindan girilen 5 pozitif sayinin toplamini hesaplayan
       // Sayi 100 den buyuk ise hatali giris yapildigi ikazi vererek programi sonlandiran kodu yaziniz...

        Scanner scan=new Scanner(System.in);
       int sayi=0;
        int toplam=0;

        for (int i = 0; i <5; i++) {
            System.out.println((i+1)+".sayiyi gir:");
            sayi=scan.nextInt();

               if(sayi>100) {
                System.out.println("hatali giris yaptiniz");
                break;
            }
               toplam+=sayi;
        }

            System.out.println("Toplam="+toplam);




    }
}
