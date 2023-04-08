package _Gun_13_While_DoWhile;

public class _04_Soru3 {
    public static void main(String[] args) {

        // 100 e kadar olan sayıların toplamını bulunuz

        int sayac=0;
        int toplam=0;
        while(sayac<=100){

             toplam=toplam+sayac;
             sayac++;
        }
        System.out.println("Toplam="+toplam);

    }
}
