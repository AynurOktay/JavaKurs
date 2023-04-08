package _Gun_05_Scanner;
import java.util.Scanner;
public class _03_Ornek2 {
    public static void main(String[] args) {
        //Kullanicidan adini ve soyadini alarak ekrana yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz=");//ekrana neyin girilecegini yaziyoruz

        String adSoyad= scan.nextLine();//okuma islemi bu asamda yapiliyor

        System.out.println("adSoyad = " + adSoyad);//tekrar ekrana yazarak kontrol ediyoruz


    }
}
