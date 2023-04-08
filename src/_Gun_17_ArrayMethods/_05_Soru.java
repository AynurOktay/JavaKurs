package _Gun_17_ArrayMethods;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        //10 elemanli bir diziyi random olarak doldurduktan sonra ,kullanicinin girecegi bir rakami arattiriniz.
        //Bu rakam var ise indexini yazdiriniz.(random araligi 10a kadar)

        int [] dizi=new int [10];

        for (int i = 0; i < dizi.length;  i++) {
            dizi[i]=(int)(Math.random()*11); //rakam dahil dedigi icin 11 le carptik

        }
        System.out.println(Arrays.toString(dizi));   //random atana sayyiyi yazdirdik

        Scanner scan=new Scanner(System.in);
        System.out.print("Aranacak sayi(0-10)="); //kullanici aradigi sayiyi girdi
        int arananSayi=scan.nextInt();





        for (int i = 0; i < dizi.length;  i++) {   //dizinin icinde kullanicinin girdigi rakami for ile aradik
            if (dizi[i] == arananSayi)


                System.out.println("Aranan sayi "+ i + ".indexte");
            }
        }

    }



