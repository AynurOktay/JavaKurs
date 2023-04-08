package _Gun_31_Enum._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {


        // Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.
        //Her pizza tipi icin ucret belirleyerek toplam ucreti yazdirirniz


        Scanner scan = new Scanner(System.in);
        ArrayList<PizzaSize> siparisler = new ArrayList<>();


        PizzaSize size = PizzaSize.SMALL;

        int secim = 0;
        do {

            menu();
            secim = scan.nextInt();
            if (secim == 1) {
                siparisler.add(PizzaSize.SMALL);
            } else if (secim == 2) {
                siparisler.add(PizzaSize.MEDIUM);
            } else if (secim == 3) {
                siparisler.add(PizzaSize.LARGE);
            } else if (secim == 4) {
                siparisGoster(siparisler);
                break;
            } else {
                System.out.println("Gecersiz secim");
            }
        } while (secim <= 4);

        siparisGoster(siparisler);

    }

    public static void menu() {
        System.out.println("*******Menu********");
        System.out.println("1-Small=" + PizzaSize.SMALL.fiyat);
        System.out.println("2-Medium=" + PizzaSize.MEDIUM.fiyat);
        System.out.println("3-Large=" + PizzaSize.LARGE.fiyat);
        System.out.println("4-Siparis yazdir:");
        System.out.println("5-Cikis");
        System.out.println("Seciminiz:");

    }

    public static void siparisGoster(ArrayList<PizzaSize> siparistopla) {
        int smallSayac = 0;
        int mediumSayac = 0;
        int largeSayac = 0;
        for (PizzaSize abc : siparistopla) {
            if (abc.equals(PizzaSize.SMALL)) {
                smallSayac++;
            } else if (abc.equals(PizzaSize.MEDIUM)) {
                mediumSayac++;
            } else if (abc.equals(PizzaSize.LARGE)) {
                largeSayac++;
            }
        }

        int toplam = 0;
        toplam = (smallSayac * PizzaSize.SMALL.fiyat) + (mediumSayac * PizzaSize.MEDIUM.fiyat) + (largeSayac * PizzaSize.LARGE.fiyat);

        System.out.println("Small pizza sayisi=" + smallSayac);
        System.out.println("medium pizza sayisi=" + mediumSayac);
        System.out.println("Large pizza sayisi=" + largeSayac);

        System.out.println("Toplam tutar=" + toplam);
    }
}
