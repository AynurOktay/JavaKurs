package ArraysOdev_3Aralik;

public class _7_ElemanOrtalama {
    public static void main(String[] args) {

        //Elemanlarin ortalamasi

        int[] sayilar={12,14,21,23,10,4};
        int toplam=0;
        int ortalama=0;

        for (int num:sayilar){

            toplam+=num;
            ortalama=toplam/6;

        }
        System.out.println(ortalama);

        //2.cözüm:


    }
}
