package _Gun_18_2dArrays;

public class _02_2dArrays {
    public static void main(String[] args) {

        int[] dizi = new int[10];
        int[] dizi2 = {2, 3, 4, 56, 6, 77};

        int[][] tablo = new int[2][3];//2 satir,3 sütun

        int[][] tablo2 = {
                {2, 3, 4,}, //0.satir
                {34, 45, 5}   //1.satir
        };

        //tabloyu yazdirmak icin:

        for (int i = 0; i < 2; i++) {

            System.out.print(tablo2[i][0]+" ");  //her bir satirin 0.elemani
            System.out.print(tablo2[i][1]+" ");//her bir satirin 1.elemani
            System.out.print(tablo2[i][2]+" ");//her bir satirin 2.elemani

            System.out.println();

            //Daha kisa ve hatasiz olan yöntem:
        }
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) { //her bir satirin sütunlarini yazdiran for
                System.out.print(tablo2[satir][sutun]+" ");
            }

            System.out.println();//her satirin yazma isleminden sonra satir atlanmsini sagliyor.
        }
    }
}