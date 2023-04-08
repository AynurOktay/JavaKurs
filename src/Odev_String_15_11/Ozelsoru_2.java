package Odev_String_15_11;

import java.util.Scanner;

public class Ozelsoru_2 {
    public static void main(String[] args) {
        //Girilen bir kelimenin bos olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String kelime=scan.nextLine();
        System.out.println("kelime = " + kelime);

        System.out.println("Bos mu?=" + kelime.isEmpty());
    }
}
