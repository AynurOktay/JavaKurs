package Odev_String_15_11;

import java.util.Scanner;

public class OzelSoru8 {
    public static void main(String[] args) {
        //Girilen bir cumledeki kelimelerin ilk harflerini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz.");
        String cumle=scan.nextLine();

        System.out.println("Ilk harfler="+cumle.replaceAll("\\B\\S",""));
    }
}
