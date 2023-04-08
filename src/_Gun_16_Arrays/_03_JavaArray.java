package _Gun_16_Arrays;

public class _03_JavaArray {
    public static void main(String[] args) {

        int[] dizi1=new int[5]; //0,1,2,3,4 indexli 5 elemanli dizi

        int[] dizi2={5,6,34,77,66}; //5 elemanli bir dizi.Hem tanimladim hem de ilk degerlerini verdim

        String[] kelimeler = new String[5];// 5 tane kelime/cumle saklayabilen bir dizi degiskeni
        boolean [] dizi3= new boolean[5];//5 tane boolean(true/false) saklayabilen bir dizi degiskeni
        double[]oranlar =new double[5]; //5 tane double saklayabilen bir dizi degiskeni

        for (int i=0 ;i <dizi1.length ;i++) {
            System.out.println("dizi=" + dizi1[i]);
        }
        for (int i = 0; i < kelimeler.length ; i++) {
            System.out.println("kelimeler=" +kelimeler[i]);
        }
        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar=" +oranlar);
        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("dizi3=" +dizi3[i]);
        }


    }
}
