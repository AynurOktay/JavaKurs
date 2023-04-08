package _Gun_19_2dArrays_Methods;

public class _02_2DArrays_farkliSütunlar {
    public static void main(String[] args) {


        int [][] tablo={
                {4,5},           //0.satir
                {45,6,77},       //1.satir
                {42,12,9,56,66},  //2.satir
                {4}               //3.satir
        };
        System.out.println("Satir miktari=" +tablo.length);
        System.out.println("=.Satirdaki  sutun sayisi=" +tablo[0].length);
        System.out.println("=.Satirdaki  sutun sayisi=" +tablo[1].length);
        System.out.println("=.Satirdaki  sutun sayisi=" +tablo[2].length);
        System.out.println("=.Satirdaki  sutun sayisi=" +tablo[3].length);

        //Yazdirma bölümü

        for (int i = 0; i < tablo.length; i++) {   //satir sayisi
            for (int j = 0; j <tablo[i].length ; j++) {  //i. sütunun uzunlugunu verir.
                System.out.print(tablo[i][j] +"\t");

            }
            System.out.println();
        }

    }
}
