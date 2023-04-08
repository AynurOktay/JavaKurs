package _Gun_16_Arrays;

import java.util.Scanner;

public class _04_ArraySoruOrtalama {
    public static void main(String[] args) {
   //Kullanicidan 7 sayi alin.Sonra ortalamadan büyük ve tek olan sayilari bulun


        Scanner scan = new Scanner(System.in);  //kullanicidan alindigi icin scanner alinir
        int sayilar[] = new int[7];     /// sayi alindigi icin önce array olarak sayilar tanimlanir

        int toplam = 0;

        for (int i = 1; i < sayilar.length; i++)
        {
            System.out.print("sayi=");//for döngüsüyle kullanicidan alinan sayilar tek tek yazdirilir,sonra toplanir
            sayilar[i] = scan.nextInt();
            toplam=toplam+sayilar[i]; }


           int ort= toplam/ sayilar.length;//ortalama alinir ve ortalamanin üstündeki syi miktari icin bir variable tanimlanir
           int miktar=0;

           for (int i = 0; i <sayilar.length; i++) {   //girilen sayilara tek tek bakip ortalamnin ustunde ve
                                                       //tek olanlari bulmasi icin tekrar bir for döngüsüne sokulur.cunku tek tek bakiliyor
            if(sayilar[i]> ort && sayilar[i]%2!= 0)
              miktar++; //sartlar uydukca miktar sayaci artiyor

        }

        System.out.println("ort=" +ort);
        System.out.println("miktar=" +miktar);



    }

}
