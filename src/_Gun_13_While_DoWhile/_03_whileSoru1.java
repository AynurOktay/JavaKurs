package _Gun_13_While_DoWhile;

import java.util.Scanner;

public class _03_whileSoru1 {
    public static void main(String[] args) {
    //Girilen 5 sayinin toplamini yazdirirn


        Scanner scan=new Scanner(System.in);

        int sayac=1;
        int toplam=0;

        while(sayac <6){

            System.out.print(sayac+".sayiyi girin=");
            int sayi= scan.nextInt();
            toplam=toplam+sayi;
            sayac++;
        }
          System.out.println("Toplam="+toplam);







    }
}
