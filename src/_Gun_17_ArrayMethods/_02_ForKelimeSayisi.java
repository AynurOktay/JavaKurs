package _Gun_17_ArrayMethods;

import java.util.Scanner;

public class _02_ForKelimeSayisi {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım

        Scanner scan=new Scanner(System.in);
        System.out.print("cümle=");
        String cumle=scan.nextLine();

        int boslukSayisi=0;
        for (int i = 0; i <cumle.length() ; i++) { //String bir cumle de bir karakter dizisi oldugundan for döngüsü kullaniyoruz.

            if (cumle.charAt(i)==' ')
                boslukSayisi++;
        }

        System.out.println("kelime sayısı = " + (boslukSayisi+1));

    }
    }

