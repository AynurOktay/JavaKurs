package Odev_24_11;


import java.util.Scanner;

public class Soru_01 {
    public static void main(String[] args) {
        //Kullanicinin girecegi 20 sayidan tek olanlarin toplamini bulunuz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayac=1;

        while(sayac<=20){
            System.out.print(sayac+".sayiyi girin:");
            int sayi=scan.nextInt();
            sayac++ ;

            if(sayi%2==1)
                toplam=toplam+sayi;
        }
        System.out.println("Toplam=" +toplam);


    }
}


