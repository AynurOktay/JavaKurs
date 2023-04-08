package _Gun_14_ForLoop;

import java.util.Scanner;

public class _04_For_soru {
    public static void main(String[] args) {
        //Kullanicinin girecegi bir rakama kadar olan sayilarin toplamini bulun(Rakam dahil)

        Scanner scan=new Scanner(System.in);

        System.out.println("Sayi girin=");
        int sayi= scan.nextInt();
        int toplam=0;

        for (int i=1 ; i<=sayi ;i++) {  //0 toplamada etkisiz olacagi icin sayaci 1 den baslattik.
            toplam = toplam + i;       //bu ifadenin kisa yazilisi   toplam+=i;

        }
            System.out.println("Toplam="+toplam);


    }
}
