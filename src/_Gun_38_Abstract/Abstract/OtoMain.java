package _Gun_38_Abstract.Abstract;

public class OtoMain {
    public static void main(String[] args) {

        Ford fr= new Ford ("mustang",1995,4);
        System.out.println(fr.getMarka());
        System.out.println("fr.getUretimYili() = " + fr.getUretimYili());
        System.out.println(fr.HizlanmaSuresi());
        System.out.println("fr = " + fr.getVitesadedi());

        //NOT:Abstract classlardan ve Interface den nesne olusturulmaz.Sadece referans olarak kullanilir
        // Sadece Classtan nesne olusturulur.Abstract classi sadece referans olarak kullaniriz.
        // OrnegiN:  BinekOto bo==new BinekOto();   ya da
        //          IBinekOto ib=new IBinekOto      yazilamaz.

    }

}
