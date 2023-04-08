package ArraysOdev_3Aralik;

public class _01_KelimeSayisi {
    public static void main(String[] args) {

        //1- Stringdeki kelime sayisini yazdirin


        String cumle="Removes white space from both ends of a string";

        int bosluk = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) ==' ')
            bosluk++;
        }

        System.out.println("Kelime sayisi=" +( bosluk + 1));

        //Split metodu ile cozum:

        String[]cumle2=cumle.split(" ");
        System.out.println("Kelime sayisi=" +cumle2.length);
         //Split bir springi parcalara ayirmak icin kullanilan method.
    }
}
