package Odev_10_11;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir banka hesabiniz var mi?:");

        boolean varMi=scan.nextBoolean();
        System.out.println("Var mi = " + varMi);
    }
}
