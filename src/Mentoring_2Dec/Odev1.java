package Mentoring_2Dec;

public class Odev1 {
    public static void main(String[] args) {
      //  0-100 arasındaki tek ve çift sayıların toplamını ayrı ayrı bulunuz.


        int toplam=0;

        int sayi;
        int toplamCift=0;
        int toplamTek=0;

        for (int i = 0;  i<=100 ; i++) {
            if(i % 2==0 )
                toplamTek+=i;}
                System.out.println("Toplam tek=" +toplamTek);


                for (int i = 0;  i<=100 ; i++) {
                    if(i % 2==0 ) {

                        toplamCift+=i;}




            System.out.println("Teoplam cift=" +toplamCift);

        }





    }
}
