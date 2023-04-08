package _Gun_09_Sorular;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Notunuzu giriniz=");
        int not=scan.nextInt();

        if(not>=50){
            System.out.println("Gecti");
        }
        if(not<50){
            System.out.println("Kaldi");
        }


    }
}
