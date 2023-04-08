package _Gun_18_2dArrays;

import java.util.Scanner;

public class _03_soru {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        //okuma islemi
        Scanner scan = new Scanner(System.in);
        int[][] tablo = new int[2][3];
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.println("sayi giriniz=");
                tablo[satir][sutun] = scan.nextInt();
            }

        }

        //yazdirma islemi

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo[satir][sutun] + "\t");
            }
            System.out.println();

        }
     //en buyuk bulma islemi:

        int enb = tablo[0][0];  //enbuyuk sayiya ilk elemani atiyoruz.Tablonun ilk elemani 0x0 indexteki rakam
                                //enb yi 0 verirsek hep eksi deger girilirse enb yi 0 verir,yanlis olur.böyle kendi icinden bi eleman verildiginde sikinti cikmaz.

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {

                if (tablo[satir][sutun] > enb)   //Döngüde sayilari saydirirken yeni gelen eleman enb den buyukse enb o yeni gelen sayi olur.
                    enb = tablo[satir][sutun];    // buyuk degilse zaten enb ye atanamiyor.döngü bitince en buyuk eleman enb ye esit oluyor
            }
        }
              System.out.println("En büyük sayi=" + enb);

     //bu 3 döngüyü tek for döngüsünde de yapabiliriz.


    }}
