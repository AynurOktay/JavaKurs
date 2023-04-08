package GenelTekrar.Methods;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

       //girilen 2 sayidan buyuk olani yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Sayi1=");
        int s1= scan.nextInt();
        System.out.println("Sayi 2=");
        int s2= scan.nextInt();

        if(s1>s2)
            System.out.println("Sayi1 buyuk");
        else
            System.out.println("Sayi2 buyuk");
    }
}
