package _Gun_10_IfElse;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        //Girilen bir ogrenci notuna göre 50den buyuk esit ise gectiniz
        //kucuk ise kaldiniz yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu girirniz");
        int ogrNot=scan.nextInt();

        if (ogrNot >= 50)
            System.out.println("Kaldiniz");


        if(ogrNot<50){
            System.out.println("Kaldiniz)");


            //2. yontem.If else ile

            if(ogrNot >= 50){    //Else olunca her zaman tek bir kontrol yapar

                System.out.println("Gectiniz");
            }
            else {
                System.out.println("Kaldiniz"); //Hayir
           }

        }
    }}