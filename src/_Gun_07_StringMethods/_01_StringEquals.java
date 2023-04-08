package _Gun_07_StringMethods;

public class _01_StringEquals {
    public static void main(String[] args) {
        //2 string birbirine esit mi diye kontrol ediyor
        //sonu boolean

        String s1="Merhaba";
        String s2="MERHABA";


        //S1 s2ye esit mi diye soruyoruz
        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi = " + esitMi);



        //2.yazdirma yolu:

        System.out.println("s1.equals(s2)="+s1.equals(s2));
        //bunu böyle yazarsak boolean variable ni yazmaya gerek yok

        System.out.println("s1.equals(Merhaba)=" + s1.equals("Merhaba"));
      // Burda Merhaba ve Merhaba yi karsilastiriyoruz



    }
}
