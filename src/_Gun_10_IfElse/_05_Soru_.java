package _Gun_10_IfElse;

import java.util.Scanner;

public class _05_Soru_ {
    public static void main(String[] args) {

        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir cumle giriniz");
    String cumle=scan.nextLine();
    int uzunluk=cumle.length();
    boolean varMi=cumle.toLowerCase().contains("study");
        System.out.println("Var mi?"+varMi);

    if (uzunluk>10  && varMi==true)
            System.out.println("Evet");

    else
        System.out.println("Hayir");

    //ya da kisa cozum

        if (cumle.length() >10 && cumle.toLowerCase().contains("study"))
            System.out.println("Evet");
        else
            System.out.println("Hayir");


    }
}