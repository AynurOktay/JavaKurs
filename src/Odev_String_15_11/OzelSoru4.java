package Odev_String_15_11;

import java.util.Scanner;

public class OzelSoru4 {
    public static void main(String[] args) {

        //Girilen bir kelimenin ilk ve son harfini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String kelime=scan.nextLine();
        int uzunluk=kelime.length();

        System.out.println("Ilk ve son harf="+kelime.substring(0,1)+kelime.substring(uzunluk-1));
    }
}
