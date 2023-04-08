package _Gun_16_Arrays;

import java.util.Scanner;

public class _02_ArraySoru {
    public static void main(String[] args) {

        //50 kisilik bir sinifin notlarini giriniz ve
        // ortalamdan büyük kac not oldugunu bulunuz ve bunlari yazdiriniz

        int notlar[]=new int[5];

        Scanner scan=new Scanner(System.in);
        int toplam=0;

        for(int i=0 ;i<notlar.length ;i++) {

            System.out.print("Notu giriniz");
            notlar[i] = scan.nextInt();


            toplam=toplam+notlar[i]; }

           int ort=toplam/ notlar.length;
            int gecenler=0;

            for(int i=0 ;i<notlar.length;i++) {

                if (notlar[i] > ort);
                {

                    System.out.println("Ortalamadan buyuk notlar=" + notlar[i]);
                    gecenler++;
                }
                System.out.println("ort="+ort);
                System.out.println("gecenler=" +gecenler);

            }











    }
}
