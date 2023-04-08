package OdevMethods;

import java.util.Scanner;

public class Soru3_ReverseString {
    public static void main(String[] args) {

        //reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle yazin:");
        String cumle = scan.nextLine();
        reverseString(cumle);

    }
    public static void reverseString(String str) {

        for (int i = (str.length() - 1); i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        String strCumle = "Java'yı seviyorum";
        reverseString(strCumle);
    }
    }






