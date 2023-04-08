package _Gun_20_Methods;

import java.util.Scanner;

public class _04_ToplamBulMetod {
    public static void main(String[] args) {

        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.Sayı=");
        int sayi1 = oku.nextInt();
        System.out.print("2.Sayı=");
        int sayi2 = oku.nextInt();


        int toplam=sayiTopla(sayi1,sayi2);;
        System.out.println(toplam);
    }

    public static int sayiTopla(int sayi1,int sayi2){
        return (sayi1+sayi2);



    }







}
