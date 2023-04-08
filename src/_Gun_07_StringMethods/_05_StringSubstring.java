package _Gun_07_StringMethods;

public class _05_StringSubstring {
    public static void main(String[] args) {

        //stringin belli bir bölümünü alma isini yapiyor

        String s1="Merhaba arkadaslar";

        String parca1=s1.substring(2,9);//3 nolu indexten 8 nolu indexe kadar
                                        // (8 dahil degil) yazdirir

        System.out.println("parca1 = " + parca1);

        String parca2=s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        String parca3=s1.substring(8); //8den sonrakilerin hepsini yzdirdik

        System.out.println("parca3 = " + parca3);






    }
}
