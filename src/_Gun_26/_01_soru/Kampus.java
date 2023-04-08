package _Gun_26._01_soru;

public class Kampus {
    public static void main(String[] args) {


        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.
        Ogrenci ogr = new Ogrenci();
        ogr.okulNo = 1;
        ogr.tamAd = "Ismet Temur";

        //1.yontem
        ogr.okulu = new Okul();
        ogr.okulu.adi = "Mehmet Akif Ersoy Lisesi";
        ogr.okulu.mudurAdi = "Merve Aslan";
        ogr.okulu.ücreti=50000;
    //2-yontem
        Okul ok=new Okul();
        ok.adi="Mehmet Akif Ersoy";
        ok.mudurAdi="Merve Aslan";
        ok.ücreti=50000;
        ogr.okulu=ok;

        System.out.println("OkulNo= "+ ogr.okulNo);
        System.out.println("otamAd = " + ogr.tamAd);
        System.out.println("okul adi = " + ogr.okulu.adi);
        System.out.println("Mudur adi = " + ogr.okulu.mudurAdi);
        System.out.println("ucreti= " + ogr.okulu.ücreti);



    }
}