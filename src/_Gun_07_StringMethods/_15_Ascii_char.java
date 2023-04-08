package _Gun_07_StringMethods;

public class _15_Ascii_char {
    public static void main(String[] args) {

        int sayi=65;

        System.out.println("sayi=" +sayi);
         char harf=(char)sayi;   //Ascii tablosuna göre A yazar.Casting yaptik,sayiyi char'a casting yaptigimiz icin harfe cevirdi
        System.out.println("harf=" +harf);

        sayi=97;
        harf=(char)sayi;

        System.out.println("harf=" + harf);

        for (int i=0 ; i<=255 ;i++){   //Butun Ascii tablosunu yazdirir.Ascii tablosunda 255 karakter vardir.

            harf =(char)i;
        System.out.println( i+".harf=" + harf);}






    }
}
