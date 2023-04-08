package Mentoring;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
// ORNEK SORU2 : Trafikte seyir halindeki kullanıcıdan trafik
// ışıklarından hangisinin yandığı bilgisini alıp
// yönlendirme yapan programı yazınız
        Scanner scan=new Scanner(System.in);
        System.out.print("Renk=");
        String renk=scan.nextLine();

        String renk1="kirmizi";
        String renk2="yesil"; //equals ile de yapilir
        String renk3="sari";

        if(renk==renk1)
            System.out.println("Dur");
        else
            if (renk==renk2)
                System.out.println("Gec");
              else
                  if(renk==renk3)
                System.out.println("Bekle");
                  else
                      System.out.println("Hatali renk");


    }
}
