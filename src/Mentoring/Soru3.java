package Mentoring;

public class Soru3 {
    public static void main(String[] args) {

        String givenWord="Ali Veli";

        System.out.println("Bas Harfler="+givenWord.substring(0,1)+"."+givenWord.substring(4,5)+".");

        //ya da

        System.out.println(givenWord.charAt(0)+"."+givenWord.charAt(4)+".");
    }
}
