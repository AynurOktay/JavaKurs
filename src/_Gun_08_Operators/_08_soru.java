package _Gun_08_Operators;

import java.util.Scanner;

public class _08_soru {
    public static void main(String[] args) {

        //girilen sayini tek olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        int kalan=sayi%2;

        System.out.println("tek mi?=" + (kalan==1));

        //ya da
        System.out.println("tek mi?=" + (sayi%2==1));


        //ya da sayiyi negatif girme ihtimaline karsi
        System.out.println("tek mi?=" + (sayi%2!=0));
    }
}