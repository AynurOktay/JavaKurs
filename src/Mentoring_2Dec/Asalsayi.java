package Mentoring_2Dec;

import java.util.Scanner;

public class Asalsayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");
        int number = input.nextInt();
        int counter = 2;
        int dividing = 0;

        while (counter < number) {
            if (number % counter == 0) {
                dividing++;
            }
            counter++;
        }
        if (number == 0 || number == 1 || number < 0) {
            System.out.println("The number entered is not a prime number. " +
                    "Enter a number of 2 or greater.");
        } else if (dividing == 0) {
            System.out.println("The number entered is a prime number.");
        } else System.out.println("The number entered is not a prime number.");

    }
}
