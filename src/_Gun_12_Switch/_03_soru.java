package _Gun_12_Switch;

import java.util.Scanner;

public class _03_soru {
    public static void main(String[] args) {
// Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Ders ve notunuzu giriniz");
       String dersVeNot= scan.nextLine();

        int ind=dersVeNot.indexOf(":");
        int not=Integer.parseInt(dersVeNot.substring(ind +1));

        //int ogrNot=Integer.parseInt(dersVeNot.replaceAll("[^0-9]","")); diger yol

       if (not>=90)
           System.out.println("A");
       else
           if
            (not>=80)
           System.out.println("B");
       else
            if (not >= 70)
                System.out.println("C");
        else
            if (not>= 60)
                System.out.println("d");
        else
            if (not >= 40)
                System.out.println("E");
        else
            System.out.println("F");

       }
    }

