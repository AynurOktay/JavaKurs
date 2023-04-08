package _Gun_14_ForLoop;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int toplam=0;
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println("Sayi girin=");
            int sayi =scan.nextInt();

            if(sayi>6 && sayi<10)
            continue;   //calistigi anda kendinden sonra gelen komutlari pas gecer.

      toplam +=sayi;
            System.out.println("toplam=" +toplam);

        }

    }
}
