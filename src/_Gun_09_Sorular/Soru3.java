package _Gun_09_Sorular;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        //Girilen bir cumlede a harfinin gecip gecmedigini
        //bulunuz geciyor ise EVET ,gecmiyor ise HAYIR yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();

        boolean varMi = cumle.contains("a");

        if (varMi == true) {
            System.out.println("EVET");
        }

        if (varMi == false) {
            System.out.println("HAYIR");
        }

        if (cumle.indexOf("a")!=-1) {
            System.out.println("Evet");

        }
       if(cumle.indexOf("a")==-1);



    }
}
