package _Gun_46;

public class Soru1 {
    public static void main(String[] args) {

        int[][] arr = new int[2][4];


        arr[0] = new int[]{1, 3, 5, 7};//0.satiri yeniden tanimlayip degerlerini verebiliyoruz
        arr[1] = new int[]{1, 3};     //1.satir

        //2 boyutlu dizilerin eleman sayisi satir sayisidir(length)
        System.out.println("arr.length=" + arr.length);  //satir sayisini verir. 2 yazdirir
        System.out.println("arr[0].length=" + arr[0].length);//0.satirirn eleman sayisini verir .4 yazar
        System.out.println("arr[1].length=" + arr[1].length);


        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        //FOR EACH:

        for (int[] satir : arr) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }

      //  for (int[] a : arr) { //a burada arr nin elemanlari yani satirlarini temsil ediyor sirasiyla
            //arr.length satir sayisini ,a.length ise her satirin eleman sayisini temsil eder


        }

    }

