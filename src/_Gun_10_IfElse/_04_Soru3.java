package _Gun_10_IfElse;

import java.util.Scanner;

public class _04_Soru3 {
    public static void main(String[] args) {

        //Mantiksal ifadeler
        //&&  ve
        //  || veya

        //Girilen sayi pozitif ve tek ise ,ekrana uygun sayi girirldi
        //degilse uygun sayi girilmedi yazin

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi girin:");
        int sayi= scan.nextInt();

        if(sayi%2==1  &&  sayi > 0)
            System.out.println("Uygun sayi girildi");

        else
            System.out.println("Uygun sayi girilmedi");

    }
}
