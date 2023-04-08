package _Gun_14_ForLoop;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
      //Girirlen bir Stringin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle girin:");
        String cumle= scan.nextLine();

        for (int i=0 ;i<cumle.length() ;i++)
        {
            if (cumle.charAt(i)==' ')
                continue; //bosluk gelince boslugu gec devam et demek oluyor
            System.out.println((cumle.charAt(i)));
        }

    }
}
