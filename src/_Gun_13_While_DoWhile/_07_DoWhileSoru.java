package _Gun_13_While_DoWhile;

import java.util.Scanner;

public class _07_DoWhileSoru {
    public static void main(String[] args) {
        /// Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        //   ve x girildiğinde ise "Program bitti" yazan programı yazınız

        Scanner scan=new Scanner(System.in);
        String karakter=" ";
         do{
             System.out.println("Bir karakter giziniz:");
             karakter=scan.next();
             if (!karakter.equalsIgnoreCase("x"))
             System.out.println("Program calisiyor.");

         }while(karakter.equalsIgnoreCase("x"));

          System.out.println("Program bitti\"");
    }
}
