package Mentoring;

import java.util.Scanner;

public class AritmetikIslemler {
    public static void main(String[] args) {

      String username="TechnoStudy";
      String password="12345";

        Scanner scan=new Scanner(System.in);
        System.out.println("Username girin=");
        String userName= scan.nextLine();
        System.out.println("Password girin=");
        String passWord=scan.nextLine();

        if(!(password.equals(passWord))&& !(username.equals(userName))) {
            System.out.println("Kullanici adi ve sifre hatali");
        }else
            if((password.equals(passWord))&& !(username.equals(userName))) {
                System.out.println("Kullanici adi hatali");
            } else{
                System.out.println("Basarili");
            }
    }
}
