package _Gun_10_IfElse;

import java.util.Scanner;

public class
_02_soru {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in)
;
        System.out.println("Vize notu:");
        int vize= scan.nextInt();
        System.out.println("Final:");
        int finalNot=scan.nextInt();

        double ortalama=((vize+finalNot)/2.0);
        System.out.println("ortalama="+ortalama);

        if (ortalama >=60){
            System.out.println("Gectiniz");
        }
        else{
            System.out.println("Kaldiniz");
        }
//Suslu parantez kurali:Sadece 1 satir calisacak ise zorunlu degil,
// birden fazla ise zorunlu.Her zaman konulabilir,mahsuru yok.



    }}
