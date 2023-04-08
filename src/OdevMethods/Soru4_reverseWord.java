package OdevMethods;

import java.util.Scanner;

public class Soru4_reverseWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle yazin:");
        String cumle=scan.nextLine();


        reverseWord(cumle);

    }
    public static void reverseWord(String str){
        String[]kelime=str.split(" ");
        for (int i = (kelime.length-1); i >=0 ; i--) {
            System.out.print(kelime[i]+" ");
        }

        }


    }

