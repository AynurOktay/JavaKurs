package _Gun_46;

public class ForEachDizi {
    public static void main(String[] args) {

        //Tek boyutlu diziler:
        int[]dizi =new int[]{1,2,3,4,5};
        int [] dizi1={1,2,3,4,5,6};

        int dizi2[]={1,2,3,4,5};

        int[] dizi3=new int[3];
        dizi3[0]=5;
        dizi3[1]=6;
        dizi3[2]=7;

        System.out.println("dizi1.length="+dizi1.length); //dizinin eleman sayisini yazdirir
        //yazdirmak icin:
        for (int i = 0; i <dizi1.length ; i++) {
            System.out.print(dizi1[i]+" ");
        }
     //tekli diziyi for each ile yazdirmak icin:
        for ( int eleman: dizi1) {
            System.out.println(eleman);
        }

      //Koseli parantezler degiskenin adinda da olabilir
        int tablo4[][]=new int [2][3];

        //tablo4 :satir sayisi 2,her satir kendi uzunlugu var , 1.satirin uzunlugu 3 ,2.satirin uzunlugu 3
        //tablo3: satir sayisi 2, 0.satirin uzunlugu 5 ,1.satirin uzunlugu 2

        System.out.println("tablo4.length="+ tablo4.length);
        System.out.println("tablo4[0].length="+ tablo4[0].length);
        System.out.println("tablo4[1].length="+ tablo4[1].length);

        for (int i = 0; i < tablo4.length; i++) { //once tablo [0] 5 ,sonra tablo [1] 2

            for (int j = 0; j <tablo4[i][j] ; j++) {
                System.out.println(tablo4[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("**********************************+++");
        for (int[] satir:tablo4) {
            for (int eleman:satir) {
                System.out.println(eleman+" ");
            }
            System.out.println();
        }

        System.out.println("*********************************");
        for (int[] satir :tablo4) {
            //1. adimda satir 2 3 4 5 6 ,asagidaki döngü sadece 2,3 ü yazar
            //2. adimda satir 2,3       asagidaki döngü satirin tamamini yani 2,3 yazdiriri

            for (int i = 0; i < tablo4.length; i++) {  //tablo4.length    2
                System.out.println(satir[i]);

            }
            System.out.println();
        }

        //Iki boyutlu diziler ,tablolar:
        int[][] tablo1=new int [2][3];  //standart tanimlama.Elemanlar sonradan tek tek atanabilir
        tablo1[0][0]=4;  tablo1[0][1]=4;   tablo1[0][2]=4;   //1.satir
        tablo1[1][0]=4;  tablo1[1][1]=4;    tablo1[1][2]=4;  //2.satir











    }
}
