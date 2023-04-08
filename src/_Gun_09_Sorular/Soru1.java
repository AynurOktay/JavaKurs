package _Gun_09_Sorular;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir sayi girin");
        int sayi= scan.nextInt();

        if(sayi%2==0){
            System.out.println("cift");
        }

        if (sayi%2!=0){
            System.out.println("tek");
        }

     //==1 yazmak yerine !=0 yazarsak negatif sayi girdigimizde de 0 dan farkli oldugu icin
        //dogru olur ==1 dersek negatif sayi girilince dogru sonucu vermez
    }
}
