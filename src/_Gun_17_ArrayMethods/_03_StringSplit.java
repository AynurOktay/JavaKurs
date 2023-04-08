package _Gun_17_ArrayMethods;

import java.util.Scanner;

public class _03_StringSplit {
    public static void main(String[] args) {

       // Split: bir Stringi parcalara ayirmak icin kullanilir

        Scanner scan=new Scanner(System.in);
        System.out.println("cumle=" );
        String cumle=scan.nextLine();

        String[] kelimeler =cumle.split(" ");

        for(int i=0 ;i <kelimeler.length; i++){
            System.out.println("Kelimeler=" +kelimeler[i]);
        }










    }
}
