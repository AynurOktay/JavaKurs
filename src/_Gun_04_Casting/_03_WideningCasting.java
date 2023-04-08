package _Gun_04_Casting;

public class _03_WideningCasting {
    public static void main(String[] args) {

        //byte >short >int >long> float  > double

        int sayi =9;
        long toplam =6700;
        double oran=3.2;

        oran=sayi;
        System.out.println("oran = " + oran); // oran=9.0 yazar.Veri kaybi yok.

        toplam=sayi;      //toplam=9 olur
        System.out.println("toplam = " + toplam);

        oran=toplam;       //oran=9.0
        System.out.println("oran = " + oran);


    }
}
