package _Gun_21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Arraylist {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.


        Scanner scan = new Scanner(System.in);
        int[] dizi = new int[6];


        for (int i = 0; i < 6; i++) {
            System.out.println("sayi= ");
            dizi[i] = scan.nextInt();
        }
        System.out.println("dizi=" + Arrays.toString(dizi));


        ArrayList<Integer> tekSayi = new ArrayList<>();
        for (int i = 0; i <dizi.length; i++) {
            if (dizi[i] % 2 != 0)
                tekSayi.add(dizi[i]);}
            System.out.println("tekSayi" + tekSayi);
        }
    }

