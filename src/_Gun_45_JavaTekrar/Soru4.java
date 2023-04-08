package _Gun_45_JavaTekrar;

public class Soru4 {
    public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers [1]=20;

         numbers =new int[4];  //onceki dizi tamamen sifirlanip yenileniyor
         numbers[2]=30;
         numbers[3]=40;

         for(int x :numbers)
        System.out.print(" " + x);

         //0,0,30,40 yazdirir 0 ve 1. indexlerin default degeri 0 dir.30,40 ta yeni verilen degerlerl
    }
}
