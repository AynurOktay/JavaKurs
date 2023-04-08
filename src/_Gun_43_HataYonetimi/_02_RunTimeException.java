package _Gun_43_HataYonetimi;

import java.util.Scanner;

public class _02_RunTimeException {
    public static void main(String[] args) {


        System.out.println("Program basladi");
        for (int i = 0; i < 3; i++) {
            try { //hatanin olma olasiginin oldugu yerin basina try koyariz.
                // cunku burda 2.sayi yerine 0 yada bir harf yazdigimizda kod kirilir,hata verir
                Scanner scan = new Scanner(System.in);

                System.out.println("Sayi1 = ");
                int sayi1 = scan.nextInt();

                System.out.println("sayi2=");
                int sayi2 = scan.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("Bolum=" + bolum);


            } catch (Exception hata)
            //hata olunca catch den sonra yakalayip yazdiriyoruz.
            // Program kirilmiyor hata mesaji yaziyor
            {
                System.out.println("hata=" + hata.getMessage()); //hatanin aciklamasi yazar.Konsoldaki msj gelir
                System.out.println("Lutfen tekarar deneyiniz");
                i--;
            }
            System.out.println("Program bitti");
        }
  //for dongusuyle hata verdiginde dogru girene kadar tekrar tekrar bilgi girilir

    }
}