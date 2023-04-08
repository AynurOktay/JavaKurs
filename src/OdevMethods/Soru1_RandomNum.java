package OdevMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Soru1_RandomNum {
    public static void main(String[] args) {

        //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        // Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi=");
        int sayi = scan.nextInt();
        int randSayi = randomNum(sayi);
        System.out.println("Dönüsen sayi=" + randSayi);


    }

    public static int randomNum(int max) {

        int randSayi = (int) (Math.random() * max);
        return randSayi;


  /*Cozum
        System.out.println(randomNum(10));
    }
    public static int randomNum(int max){
        return (int) (Math.random()*max);
    }*/





    }

    }
