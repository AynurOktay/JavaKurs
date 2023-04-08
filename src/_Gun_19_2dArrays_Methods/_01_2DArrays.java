package _Gun_19_2dArrays_Methods;

public class _01_2DArrays {
    public static void main(String[] args) {
         int [][]  tablo ={
                 {3,4,55},
                 {23,33,43}
         };

        for (int i = 0; i < tablo.length; i++) { //satir uzunlugu

            for (int j = 0; j < tablo[i].length; j++) { //ilgili satirdaki sutun uzunlugu

                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();

        }



    }
}
