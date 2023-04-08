package ArraysOdev_3Aralik;

public class _3_DiziToplamsayi {
    public static void main(String[] args) {

        //Sayilarin toplamini yazdir

        int[]sayilar={25,30,30,35,100};

        int toplam=0;

        for (int num : sayilar) {

            toplam=toplam+num ;

        }
        System.out.println("Toplam="+toplam);

        //Array ile cozum:
        int[]sayilar2={25,30,30,35,100};
        int toplam2=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam2+=sayilar[i];

        }
        System.out.println(toplam2);





    }
}
