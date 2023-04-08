package _Gun_13_While_DoWhile;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {

        //Kullanici 0 degeri girene kadar
        // girdigi sayilarin toplamini bulunuz

        Scanner scan=new Scanner(System.in);

        int sayi;
        int toplam=0;

        System.out.println("Sayi giriniz");
        sayi=scan.nextInt();
        toplam=toplam+sayi;

        while(sayi !=0)
        {
            System.out.println("Sayi giriniz");
            sayi=scan.nextInt();
            toplam=toplam+sayi;
        }
        System.out.println("Toplam=" +toplam);

   //do while;

        int sayi1;
        int toplam1=0;
        //döngü arasi sart basta olmadigindan en az bir kere calisir
        do{
            System.out.println("Sayi giriniz");
            sayi=scan.nextInt();
            toplam=toplam+sayi;

        }while (sayi!=0);

        System.out.println("Toplam=" +toplam);


    }
}
