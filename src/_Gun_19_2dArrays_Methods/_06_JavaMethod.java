package _Gun_19_2dArrays_Methods;

public class _06_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz();
        merhabaYazIsme("ismet'e ");
        cokMerhabaYaz(5);
    }


    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");

    }

    public static void merhabaYazIsme(String isim) {
        System.out.println(isim + "Merhaba ");

    }

    public static void cokMerhabaYaz(int miktar) {
        for (int i = 0; i < miktar; i++) {
            System.out.println("Merhaba ");
        }
    }
}