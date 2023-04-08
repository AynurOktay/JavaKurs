package _Gun_08_Operators;

import java.util.Scanner;

public class _09_soru {
    public static void main(String[] args) {
        //girilen bir cumledeki ilk kelimeyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Cumle giriniz;");
        String cumle=scan.nextLine();

        int boslukIndex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0,boslukIndex);
        System.out.println("ilkKelime = " + ilkKelime);

        //unutma!!!
       //eger cumle verilrse indexi sayarak substring yapabiliriz.
        // ama kullanici tarafindan cumle girilecekse indexi bilemeyecegimiz icin
        //mutlaka once int index of la aradigimiz indexi tanimlariz,sonra onu kullaniriz

    }
}
