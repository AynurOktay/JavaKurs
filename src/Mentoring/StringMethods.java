package Mentoring;

public class StringMethods {
    public static void main(String[] args) {

        String word="techno Study";
        String number="123";

        int uzunluk=word.length();
        int uzunluk2=number.length();
        System.out.println("Uzunluk="+uzunluk);
        System.out.println("uzunluk2="+uzunluk2);

        System.out.println(word.toLowerCase());

        System.out.println(word.toUpperCase());

        System.out.println(word.contains("h"));
        System.out.println(word.concat("number"));
        System.out.println();
    }
}
