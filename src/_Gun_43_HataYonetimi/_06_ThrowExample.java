package _Gun_43_HataYonetimi;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni sifre olusturma");

        System.out.print("Yeni sifreniz=");
        String newPassword = scan.nextLine();

        try {
            if (newPassword.length() < 8)
                throw new Exception("Sifre en az 8 karakterden olusmali");
            if (newPassword.length() > 15)
                throw new Exception("Sifre en fazla 15 karakterden olusmali");

        } catch (Exception ex) {
            System.out.println("Lutfen Dikkat!");
            System.out.println(ex.getMessage());
        }
    }
}