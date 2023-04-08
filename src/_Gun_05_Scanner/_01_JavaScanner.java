package _Gun_05_Scanner;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        // tipi  -  adi  -ilk degeri    islem tamam
            int     sayi =  5;
        Scanner okuyucu=new Scanner(System.in);
        System.out.println("Sayi giriniz=");
            sayi= okuyucu.nextInt(); //
        // konsol sayi girisi icin () -> bekliyor
        //rakam girilip entera basinca  degeri alip sayiya atiyor
        System.out.println("Sayi="+sayi);






    }
}
