package _Gun_11_Ternary_MathMethods;

import java.util.Scanner;

public class _02_soru2 {
    public static void main(String[] args) {

        //Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız


        Scanner scan = new Scanner(System.in);
        System.out.println("Kac saat otoparkta kaldiginizi yazin");
        int sure = scan.nextInt();


        if (sure <= 3) {
            System.out.println("10tl"); //else koymazsak her if icin ayri calismasi gerekir.else koyunca hepsini calistirmaz
        } else {
            if (sure <= 5) {
                System.out.println("15 tl");
            } else {
                System.out.println("20 tl");
            }


        }

    }
}
