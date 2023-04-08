package _Gun_10_IfElse;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner scan=new Scanner(System.in);
        System.out.println("Password girirniz");
        String password=scan.nextLine();
        int uzunluk=password.length();
       boolean varMi=password.toLowerCase().contains("pass");
       if(uzunluk<=12 && uzunluk >=8 && varMi==false )
           System.out.println("Password uygun");

       else
           System.out.println("Password uygun degil");

       // 2.yontem
         if (password.length() >=8 && password.length()<=12 &&
                 password.toLowerCase().contains("pass")==false)
             System.out.println("uygun");
         else System.out.println("uygun degil");

         //3.yontem

        if (password.length() >=8 && password.length()<=12 &&
                !password.toLowerCase().contains("pass"))

            System.out.println("uygun");
        else
            System.out.println("uygun degil");



    }
}
